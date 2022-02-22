package file_flow.manager_file;

import java.io.File;
import java.io.IOException;

public class TestCreateFile {

    public static void main(String[] args) {

        String basePath = "/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow/manager_file/test_file";

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
