package src.java.FileStream;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleFile {

    // 根据路径创建文件
    public boolean createFile(String path) {
        File file = new File(path);
        // System.out.println(file.isDirectory());

        if (!file.isDirectory()) {

            String reg = "^/[\\s\\S]*/";
            Pattern patten = Pattern.compile(reg);//编译正则表达式
            Matcher matcher = patten.matcher(path);

            while (matcher.find()) {
                File createDir = new File(matcher.group());
                boolean isMkdirs = createDir.mkdirs();
            }
        }

        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 获取指定文件夹下所有子文件的名称
    public void getChildFileName(File file) {

        File[] files = file.listFiles();

        if (files != null && files.length != 0) {
            for (File f : files) {
                this.getChildFileName(f);
            }
        }

        if (file.isFile()) {
            System.out.println(file.getAbsolutePath());
        }
    }

    // 递归删除文件夹
    public void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }
        boolean isDelete = file.delete();
    }

    // 写入文件内容
    public void write(String path, String content) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 获取文件内容
    public String getContent(String path) {

        FileInputStream fileInputStream = null;
        StringBuilder builder = new StringBuilder();

        try {

            int i = 0;
            fileInputStream = new FileInputStream(path);
            i = fileInputStream.read();
            while (i != -1) {
                builder.append((char) i);
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    // 复制文件
    public void copyFile(String filePath, String path) {

        int SIZE = 1024;

        FileInputStream fis = null;
        FileOutputStream fos = null;

        String targetPath = "";
        String newFileName = "";

        File file = new File(filePath);
        String fileName = file.getName();

        try {

            // System.out.println("[targetPath ]: " + path);
            // System.out.println("[has targetPath ]: " + (path.length() > 0) + " | " + new File(path).isDirectory());

            if (path.length() > 0 && new File(path).isDirectory()) {

                targetPath = path.matches(".*[/]{1}$") ? path : path + "/";

            } else {

                Pattern pattern = Pattern.compile("/.*/");                         // 1. 创建指定规则的正则对象
                Matcher matcher = pattern.matcher(filePath);                       // 2. 创建 匹配器

                while (matcher.find()) {                                           // 3. 开始匹配
                    // System.out.println(matcher.group());                        // 4. 输出匹配结果
                    targetPath = matcher.group();
                }
            }

            // System.out.println("[target path]: " + targetPath);

            Pattern pattern = Pattern.compile("-copy_[0-9]{2,}");
            Matcher matcher = pattern.matcher(fileName);

            // System.out.println("[matcher]: " + matcher.find());

            while (matcher.find()) {
                targetPath = matcher.group();
            }
            newFileName = fileName;

            // System.out.println("[file name]: " + fileName);
            // System.out.println("[new file path]: " + targetPath + newFileName);

            File newFile = new File(targetPath + newFileName);

            fos = new FileOutputStream(newFile);
            byte[] b = new byte[SIZE];
            fis = new FileInputStream(filePath);
            int count = fis.read(b);

            while (count != -1) {

                // 加密操作
//                byte temp = b[0];
//                b[0] = b[1];
//                b[1] = temp;
                // 加密操作

                fos.write(b, 0, count);
                fos.flush();
                count = fis.read(b);
            }

            System.out.println("[copy success]");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {

                e.printStackTrace();
            }

            try {
                if (fos != null) {
                    fos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    // 复制文件夹
    public void copyFolder(String curPath, String tarPath) {

        File curFile = new File(curPath);
        File[] curFileList = curFile.listFiles();

        String curFilePath = curFile.getAbsolutePath();
        String curFileName = curFile.getName();
        String curDirName = curFile.getParent();

//        System.out.println(curDirName);

        String newFilePath = "";
        File newFile = null;

//         System.out.println("[tarPath]: " + tarPath);
        // System.out.println("[curFilePath]: " + curFilePath + "/" + curFileName);

//        System.out.println("[newFilePath]: " + newFilePath);
//        System.out.println("[curFileList]: " + (curFileList != null));

        newFilePath = curFilePath + "/" + curFileName;
        newFile = new File(newFilePath);

        if (curFileList != null) {

            newFilePath = curFilePath + "/" + curFileName;
            newFile = new File(newFilePath);

            boolean isMkdir = newFile.mkdir();
            if (curFileList.length != 0) {
                for (File f : curFileList) {
//                    System.out.println("[f]: " + f);
                    this.copyFolder(f.getAbsolutePath(), tarPath);
                }
            }

            // String newFilePath = tarPath + curFilePath;

        } else {

            newFilePath = tarPath + "/" + new File(curFilePath).getParentFile().getName() + "/" + curFileName;
            newFile = new File(newFilePath);

//            System.out.println("[curFilePath]: " + curFilePath);
//            System.out.println("[newFilePath]: " + newFilePath);

            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
//                System.out.println("[curFile]: " +curFile);
//                System.out.println("[newFile]: " +newFile);

                fis = new FileInputStream(curFile);
                fos = new FileOutputStream(newFile);

                byte[] b = new byte[1024];
                int count = fis.read(b);

                while (count != -1) {
                    fos.write(b, 0, count);
                    fos.flush();
                    count = fis.read(b);
                }

//                System.out.println(newFile.getAbsolutePath());

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {

                    e.printStackTrace();
                }

                try {
                    if (fos != null) {
                        fos.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        if (newFile.isFile()) {
            System.out.println("[" + curFileName + " file copy end]");
        } else {
            System.out.println("[" + curFileName + " directory copy end]");
        }
    }
}