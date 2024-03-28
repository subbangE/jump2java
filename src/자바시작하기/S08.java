package 자바시작하기;

public class S08 {
    public static void main(String[] args) {
        int totalSec = 7582;
        int min = totalSec/60;
        int hour = min/60;
        int bun = min % 60;
        int sec = totalSec % 60;


        System.out.printf("%d시간 %d분 %d초", hour, bun, sec);

    }
}
