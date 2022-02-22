package file_flow.manager_file;

import java.io.File;

public class TestGetParentFile {

    public static void main(String[] args) {

        String basePath = "/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow/manager_file/test_file";

        File file = new File(basePath + "/fileBase.md");

        File parentFile = file.getParentFile();

        while(parentFile != null) {
            System.out.println(parentFile);
            parentFile = parentFile.getParentFile();
        }
    }
}
