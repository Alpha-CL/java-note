package src.java.FileStream.ManagementFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFileBaseMember {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/java/FileStream/ManagementFile/files";


        File file = new File(basePath + "/fileBase.md");

        System.out.println("getName: " + file.getName());
        System.out.println("length: " + file.length());
        System.out.println("getParent: " + file.getParent());
        System.out.println("getPath: " + file.getPath());
        System.out.println("getAbsolutePath: " + file.getAbsolutePath());

        System.out.println("canExecute: " + file.canExecute());
        System.out.println("canRead: " + file.canRead());
        System.out.println("canWrite: " + file.canWrite());
        System.out.println("isHidden: " + file.isHidden());

        System.out.println("isFile: " + file.isFile());
        System.out.println("isDirectory: " + file.isDirectory());

        long time = file.lastModified();
        System.out.println("lastModified: " + time);
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss");
        System.out.println(sdf.format(date));

        boolean update = file.setLastModified(time);
        System.out.println("lastModified: " + time);


    }
}
