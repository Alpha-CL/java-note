package file_flow;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class ManagerFile {

    public static void main(String[] args) {


        File file = new File("/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow/test.md");


        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("isFile: " + file.isFile());

        System.out.println("canExecute: " + file.canExecute());
        System.out.println("canRead: " + file.canRead());
        System.out.println("canWrite: " + file.canWrite());

        System.out.println("length: " + file.length());

        System.out.println("lastModified: " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(file.lastModified()));

        System.out.println("getName: " + file.getName());
        System.out.println("getAbsolutePath: " + file.getAbsolutePath());
        System.out.println("getPath: " + file.getPath());


        File filePath = new File("/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow/testDir");

        System.out.println("mkdir: " + filePath.mkdir());       // mkdir
        System.out.println("mkdirs: " + filePath.mkdirs());     // mkdir -p

        // System.out.println("getParentFile: " + filePath.getParentFile());
        System.out.println("getParent: " + filePath.getParent());

        File pFile = filePath.getParentFile();

        while(pFile != null) {
            System.out.println("getParent: " + pFile.getParent());
            pFile = pFile.getParentFile();
        }

        File fileChildList = new File("/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src");

        File[] childList = fileChildList.listFiles();
        System.out.println("childList.length: " + childList.length);
        System.out.println("childList: " + Arrays.toString(childList));

        try {

            boolean newFile = file.createNewFile();
            System.out.println("newFile: " + newFile);

        } catch (IOException e) {

            e.printStackTrace();
        }



    }
}