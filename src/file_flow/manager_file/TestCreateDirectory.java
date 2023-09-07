package src.file_flow.manager_file;

import java.io.File;

public class TestCreateDirectory {

    public static void main(String[] args) {


        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/src.file_flow/manager_file/test_file";


        File file1 = new File(basePath + "/createDirectory1");
        File file2 = new File(basePath + "/createDirectory2/subDirectory");

        // 若已有该目录则会创建失败
        boolean isDelete1 = file1.delete();
        boolean isDelete2 = file2.delete();

        boolean isCreate1 = false;
        boolean isCreate2 = false;

        try {

            isCreate1 = file1.mkdir();
            isCreate2 = file2.mkdirs();

        } finally {

            System.out.println("mkdir: " + isCreate1);
            System.out.println("mkdirs: " + isCreate2);
        }
    }
}
