package src.file_flow.file_buffer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedRead {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/src.file_flow/file_buffer_stream/test_file/user_list.txt";

        FileReader fr = null;
        BufferedReader br = null;

        /**
         * br.readLine();
         *
         *
         * 获取一行的内容
         */

        try {

            fr = new FileReader(testFilePath);
            br = new BufferedReader(fr);

            String lineContent = br.readLine();     // 获取一行的内容

            int lineNum = 1;

            while (lineContent != null) {

                System.out.println(lineNum + ": " + lineContent);
                lineContent = br.readLine();
                lineNum++;
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
