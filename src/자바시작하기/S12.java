package 자바시작하기;

public class S12 {
    public static void main(String[] args) {
        int num = 374;
        int oneDigit = num % 10;
        int tenDigit = (num / 10) % 10;
        int hunDigit = num / 100;

        System.out.printf("총합: %d", oneDigit+tenDigit+hunDigit);
    }
}
