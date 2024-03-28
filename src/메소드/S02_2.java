package 메소드;

public class S02_2 {
    public static void main(String[] args) {
        int n = 3;
        double result = calorieCalculator(n);
        System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);
    }

    public static double calorieCalculator(int n) {
        return n * 180 * 5.179;
    }
}
