package ch07;

import java.io.*;

public class 파일없음 {                         // throws IOException 파일 찾지 못하는 예외와 읽지 못하는 예외가 포함
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("나없는파일"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 못찾았습니다!");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못합니다.");
        }
    }
}
