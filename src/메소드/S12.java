package 메소드;

public class S12 {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    public static void printPay(double basePay, int hours) {
        double pay = 0.0;

        if (hours > 60) {
            System.out.printf("초과 근무시간 에러!\n");
            return;
        } else if (basePay < 8.00) {
            System.out.printf("최저 시급 에러!\n");
            return;
        } else if (hours > 40) {
            pay = basePay * 40 + basePay * (hours - 40) * 1.5;
        } else {
            pay = basePay * hours;
        }

        System.out.printf("$ %.2f\n", pay);
    }
}
