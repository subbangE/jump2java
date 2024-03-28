package 배열과반복문;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        double strat = 72.4;
        int after = 5;

        double result = weight(strat, after);
        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    public static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        for (int i=0; i<months; i++) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
