package ch06;

import java.io.IOException;
import java.io.InputStream;

public class 배열로입력 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a = new byte[3]; // 3byte 배열 생성
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
