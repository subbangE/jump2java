package ch06;

import java.io.FileWriter;
import java.io.IOException;

public class 추가로쓰기 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("out2.txt", true);
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다. \r\n";
            fw.write(data);
        }
        fw.close();
    }
}
