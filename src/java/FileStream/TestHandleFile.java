package src.java.FileStream;

import java.io.File;

public class TestHandleFile {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/src.java.file_flow/test_file";
        String copyPath = projectPath + "/src/src.java.file_flow/test_copy";

        String[] CONTENTS = new String[]{"hello world", "just do it", "alpha"};

        File filesDirectory = new File(basePath);
        HandleFile ntf = new HandleFile();

        ntf.deleteFile(filesDirectory);

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

        System.out.println("get absolute path of child file in file_test.");
        ntf.getChildFileName(filesDirectory);

        ntf.copyFile(basePath + "/test1.md", copyPath);
        ntf.copyFolder(basePath, basePath);
    }
}