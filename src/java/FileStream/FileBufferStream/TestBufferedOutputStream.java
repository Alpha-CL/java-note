package src.java.FileStream.FileBufferStream;

import java.io.*;

public class TestBufferedOutputStream {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/java/FileStream/FileBufferStream/files/test_output_stream.txt";

        FileOutputStream fos = null;
        File file = null;
        BufferedOutputStream bos = null;

        try {

            file = new File(testFilePath);               // 1. 创建文件
            fos = new FileOutputStream(file);            // 2. 创建 常规流
            bos = new BufferedOutputStream(fos);         // 3. 利用 常规流 创建 缓冲流

            String content = "Hello, BufferedOutputStream!";
            byte[] bytes = content.getBytes();

            bos.write(bytes);                           // 写入数据

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                assert bos != null;
                bos.close();

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
