package file_flow.file_stream.byte_flow;

import java.io.FileInputStream;
import java.io.IOException;

public class TestByteFlow {

    public static void main(String[] args) {


        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/file_flow/byte_flow/test_file.txt";

        /**
         * 字节流
         *
         *
         ** 优点:可以读取任何类型的文件
         *
         ** 缺点: 读取纯文本文件时
         *       因每个字所占的字节可能不同, 导致文件乱码
         */

        try {

            FileInputStream fis = new FileInputStream(basePath);
            byte[] b = new byte[5];
            int count = fis.read(b);

            System.out.println("[file content]: def我爱你abc");

            System.out.println("\n");
            System.out.println("<!-- read content start -->");
            while (count > 0) {
                System.out.print(new String(b, 0, count, "GBK"));
                count = fis.read(b);
            }
            System.out.println("\n<!-- read content end -->");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
