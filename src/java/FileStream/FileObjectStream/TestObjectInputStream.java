package src.java.FileStream.FileObjectStream;

import java.io.*;

public class TestObjectInputStream {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/src.java.file_flow/file_object_stream/test_file/test_object_stream.txt";

        Demo dm = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream(testFilePath);
            ois = new ObjectInputStream(fis);

            Demo d = (Demo) ois.readObject();
            System.out.println(d.toString());

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        } finally {

            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
