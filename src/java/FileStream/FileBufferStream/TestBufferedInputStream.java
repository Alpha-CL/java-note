package src.java.FileStream.FileBufferStream;

import java.io.*;

public class TestBufferedInputStream {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/src.java.file_flow/file_buffer_stream/test_file/test_bit_flow.txt";

        FileInputStream fis = null;
        File file = null;
        BufferedInputStream bis = null;

        try {

            file = new File(testFilePath);              // 1. 创建文件
            fis = new FileInputStream(file);            // 2. 创建 常规流
            bis = new BufferedInputStream(fis);         // 3. 利用 常规流 创建 缓冲流

            System.out.println("file has " + bis.available() + " bit.");

            byte[] section = new byte[1024];
            int count = bis.read(section);

            System.out.println("\n");

            while (count != -1) {
                System.out.println(new String(section, 0, count));
                count = bis.read(section);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                assert bis != null;
                bis.close();

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}