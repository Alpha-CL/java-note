package file_flow;

import java.io.File;

public class TestFile {

    public static void main(String[] args) {


        String base = "/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow";
        File file = new File(base + "/test.md");
        File fileDir = new File(base + "/testDir");


        System.out.println(file.getPath());
        System.out.println(file.isFile());


        System.out.println(fileDir.isDirectory());




    }
}
