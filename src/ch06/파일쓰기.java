package ch06;

import java.io.FileOutputStream;
import java.io.IOException;

public class 파일쓰기 {
    public static void main(String[] args) throws IOException {
        // 파일이 위치에 없으면 자동으로 만듬
        FileOutputStream output = new FileOutputStream("out.txt");
        // 파일 쓰기
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다. \r\n";  // \r\n 한줄 띄운뒤 첫번째 위치
            output.write(data.getBytes());
        }

    }
}
