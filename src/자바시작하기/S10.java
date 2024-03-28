package 자바시작하기;

public class S10 {
    public static void main(String[] args) {
        int man = 10000;
        int och = 5000;
        int ch = 1000;

        int sum = 0;
        sum += man * 3;
        sum += och * 4;
        sum += ch * 7;

        System.out.printf("%d원", sum);
    }
}
