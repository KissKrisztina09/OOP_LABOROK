package labor10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileUtil.encode("./src/Labor_10/FileUtil.java", "temp1.txt");
            FileUtil.decode("temp1.txt", "Labor_10/temp2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}