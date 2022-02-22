package file_flow;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleFile {

    // 根据路径创建文件
    public boolean createFile(String path) {
        File file = new File(path);
//        System.out.println(file.isDirectory());

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

    // 删除文件
    public boolean deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }
        return file.delete();
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
}
