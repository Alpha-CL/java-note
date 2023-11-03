package src.old.file_flow.file_buffer_stream;

import java.io.*;

public class TestBufferedWrite {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/src.old.file_flow/file_buffer_stream/test_file/test_write.txt";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(testFilePath);
            bw = new BufferedWriter(fw);
            
            bw.newLine();
            bw.write("first line");
            bw.newLine();
            bw.write("second line");
            bw.newLine();
            bw.write("three line");

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bw != null;
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
