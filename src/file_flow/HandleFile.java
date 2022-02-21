package file_flow;

import java.io.File;

public class HandleFile {

    // 展示文件
    public void showFile(File file) {

        File[] files = file.listFiles();

        if (files != null && files.length != 0) {
            for (File f : files) {
                this.showFile(f);
            }
        }

        System.out.println(file.getAbsolutePath());
    }

    // 删除文件
    public void deleteFile(File file) {

        File[] files = file.listFiles();

        if (files != null && files.length != 0) {
            for (File f : files) {
               this.deleteFile(f);
            }
        }

        file.delete();
    }


}
