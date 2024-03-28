package 배열과반복문;

public class S06 {
    public static void main(String[] args) {
        int number = 4;
        printFactorial(number);
    }

    public static void printFactorial(int n) {
        int result = 1;
        System.out.printf("%d! = ", n);
        for (int i = n; i > 0; i--) {
            System.out.printf("%d", i);
            result *= i;
            if (i != 1) {
                System.out.printf(" x ");
            }
        }
        System.out.printf(" =  %d\n", result);
    }
}
