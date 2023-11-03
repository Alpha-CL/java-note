package src.old.file_flow.file_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String file = projectPath + "/src/src.old.file_flow/character_flow/test_file.txt";

        FileReader fr = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(file, true);
            fw.write(97);
            fw.write("str".toCharArray());
            fw.write("hello world");
            fw.flush();

            fr = new FileReader(file);
            int code = fr.read();

            System.out.println("file has " + code + " byte");

            char[] c = new char[1024];
            int count = fr.read(c);

            while (count != -1) {
                System.out.print("[file content]: " + new String(c, 0, count));
                count = fr.read(c);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}