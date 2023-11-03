package src.old.file_flow.file_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) {

        /**
         * 文件流
         *
         *
         * 创建 File 对象, 建立与文件之间的联系,
         *
         *
         */

        String projectPath = System.getProperty("user.dir");
        String basePath = projectPath + "/src/src.old.file_flow/file_stream/test_file";


        FileInputStream fileInputStream1 = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;

        try {

            fileInputStream1 = new FileInputStream(basePath + "/testInputStream.md");
            fileInputStream2 = new FileInputStream(basePath + "/testInputStream.md");
            fileInputStream3 = new FileInputStream(basePath + "/testInputStream.md");


            /**
             * fileInputStream.available();
             *
             *
             * @return: 返回 流管道 中, 还剩多少字节
             */

            int v = fileInputStream2.available();

            System.out.println("fileInputStream: " + v + " byte");
            System.out.println("\n");


            /**
             * fileInputStream.read();
             *
             *
             * 每次从 管道流 中, 读取一个字节的内容
             */

            int i = fileInputStream1.read();
            StringBuilder builder = new StringBuilder();

            while (i != -1) {
                builder.append((char) i);
                i = fileInputStream1.read();
            }

            System.out.println("<!-- fileInputStream content by .read()  start -->");
            System.out.println(builder);
            System.out.println("<!-- fileInputStream content by .read()  start -->");


            /**
             * fileInputStream.read(byte[]);
             *
             *
             * 1. 创建 File 对象 与文件形成联系
             * 2. 通过 File 对象 和 限制条件, 读取指定文件的内容
             *      - 将文件中的内容流先读取出来
             *      - 再使用
             */

            byte[] b = new byte[11];
            int count = fileInputStream2.read(b);

            System.out.println("<!-- fileInputStream content by .read(byte[])  start -->");
            while (count != -1) {
                String value = new String(b, 0, count);
                System.out.println(value.trim());
                count = fileInputStream2.read(b);
            }
            System.out.println("<!-- fileInputStream content by .read(byte[])  end -->");


            /**
             * fileInputStream.skip(number);
             *
             *
             * 跳过指定字节长度的内容
             *
             ** 多线程并行读取文件( 利用多个流分别读取内容中不同字节范围的内容, eg: 1~2000, 2000~4000, 4000~6000 ... )
             */

            long offsetNum = fileInputStream3.skip(11);
            System.out.println(offsetNum);

            int code = fileInputStream3.read(b);
            System.out.println((char) code);


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                /**
                 * 关闭流通道
                 */

                if (fileInputStream1 != null) {
                    fileInputStream1.close();
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileInputStream3 != null) {
                    fileInputStream3.close();
                }

            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }
}