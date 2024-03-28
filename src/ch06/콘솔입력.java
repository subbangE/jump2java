package ch06;

import java.io.IOException;
import java.io.InputStream;

public class 콘솔입력 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int a, b, c;

        a = in.read();  // 콘솔에서 받은 입력(1byte)을 input에 대입
        b = in.read();
        c = in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}