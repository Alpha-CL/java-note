package src.java.FileStream.FileBufferStream;

import java.io.*;

public class TestBufferedWrite {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/java/FileStream/FileBufferStream/files/test_write.txt";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(testFilePath);
            bw = new BufferedWriter(fw);
            
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
