package src.java.FileStream.ManagementFile;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/java/FileStream/ManagementFile/files";

        File file = new File(basePath + "/createFile.md");

        boolean isCreate = false;

        try {

            isCreate = file.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            System.out.println(isCreate);
        }
    }
}
