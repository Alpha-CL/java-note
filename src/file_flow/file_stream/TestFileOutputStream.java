package src.file_flow.file_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/src.file_flow/file_stream/test_file";

        File file1 = new File(basePath + "/testOutputStream1.md");
        File file2 = new File(basePath + "/testOutputStream2.md");
        File file3 = new File(basePath + "/testOutputStream3.md");

        FileOutputStream fileOutputStream1;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;

        try {

            /**
             * write(content, isAppend);
             *
             *
             * 文件写入, 会覆盖之前文件的内容
             * 写入文件, 并追加, 则会将内容追加到之前文件内容之后
             */

            fileOutputStream1 = new FileOutputStream(file1);
            fileOutputStream1.write(90);
            fileOutputStream1.flush();
            System.out.println("fileOutputStream1.md write end");


            /**
             * new FileOutputStream(File, isAppend);
             *
             *
             * @isAppend: 写入内容是否追加到文件内容之后
             */

            fileOutputStream2 = new FileOutputStream(file2, true);
            fileOutputStream2.write(90);
            fileOutputStream2.write(91);
            fileOutputStream1.flush();
            System.out.println("fileOutputStream1.md write end");

            System.out.println("fileOutputStream2.md write end");


            fileOutputStream3 = new FileOutputStream(file3);

            String str = "hello world";
            byte[] content = str.getBytes();

            /**
             * fileOutputStream.write(byte[]);
             *
             */

            fileOutputStream3.write(content);
            fileOutputStream3.flush();
            System.out.println("fileOutputStream3.md write end");


        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}