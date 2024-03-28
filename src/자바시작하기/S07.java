package 자바시작하기;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("곱하기: %d x %d = %d\n", a, b, a * b);
        System.out.printf("나누기 몫: %d / %d = %d\n", a, b, a/b);
        System.out.printf("나누기 나머지: %d / %d = %d\n", a, b , a%b);


    }
}
