package file_flow.manager_file;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/file_flow/manager_file/test_file";

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
