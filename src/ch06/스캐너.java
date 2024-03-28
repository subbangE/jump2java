package ch06;

import java.util.Scanner;

public class 스캐너 {
    public static void main(String[] args) {
//        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextFloat());
        sc.close(); // 사용후 닫기 (메모리 절약)
    }
}
