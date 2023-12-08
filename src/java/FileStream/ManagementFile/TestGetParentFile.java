package src.java.FileStream.ManagementFile;

import java.io.File;

public class TestGetParentFile {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/src.java.file_flow/manager_file/test_file";


        File file = new File(basePath + "/fileBase.md");

        File parentFile = file.getParentFile();

        while(parentFile != null) {
            System.out.println(parentFile);
            parentFile = parentFile.getParentFile();
        }
    }
}
