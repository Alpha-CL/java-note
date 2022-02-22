package file_flow;

import java.io.File;
import java.io.IOException;

public class TestHandleFile {

    public static void main(String[] args) {

        String basePath = "/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow/test_file";

        String[] CONTENTS = new String[]{"hello world", "just do it", "alpha"};

        File filesDirectory = new File(basePath);
        HandleFile ntf = new HandleFile();

        boolean isDelete = ntf.deleteFile(filesDirectory);
        // System.out.println("isDelete directory: " + isDelete);

        for (int i = 0; i < 3; i++) {

            String finallyPath = basePath + "/test" + (i + 1) + ".md";

            // 创建文件
            boolean isCreate = ntf.createFile(finallyPath);
            // System.out.println("test" + (i + 1) + ": " + isCreate);

            // 写入内容
            if (isCreate) {
                ntf.write(finallyPath, CONTENTS[i]);
            }

            // 获取文件内容
            System.out.println("test" + (i + 1) + ".md: " + ntf.getContent(finallyPath));

        }

        ntf.getChildFileName(filesDirectory);
    }

}
