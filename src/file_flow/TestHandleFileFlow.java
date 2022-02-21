package file_flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestHandleFileFlow {

    public static void main(String[] args) {

        try {


            String base = "/Users/lalpha/SynologyDrive/Drive/dlp/dlp-lrn/github/java-note/src/file_flow";
            File file = new File(base + "/test.md");
            FileInputStream files = new FileInputStream(file);


            int i;
            while (files.read() != -1) {
                i = files.read();           // 每次读取一个字节
                System.out.println(i);      // 当前索引位置对应的 unicode 码
            }


        } catch (FileNotFoundException e) {


            e.printStackTrace();


        } catch (IOException e) {


            e.printStackTrace();
        }

    }
}
