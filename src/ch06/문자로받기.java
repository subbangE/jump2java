package ch06;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 문자로받기 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
    }
}
