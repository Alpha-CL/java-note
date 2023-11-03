package src.old.file_flow.file_object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String testFilePath = projectPath + "/src/src.old.file_flow/file_object_stream/test_file/test_object_stream.txt";

        Demo dm = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            dm = new Demo("alpha", 18);

            fos = new FileOutputStream(testFilePath);
            oos = new ObjectOutputStream(fos);


            oos.writeObject(dm);

            /**
             * 仅可一个对象一个对象写入
             * 不可以同时写入多个对象
             */
            // oos.writeObject(dm1);
            // oos.writeObject(dm2);
            // oos.writeObject(dm3);

            oos.flush();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
