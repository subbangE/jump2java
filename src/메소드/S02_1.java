package 메소드;

public class S02_1 {
    public static void main(String[] args) {
        S02_1 cal = new S02_1();
        double result = cal.calculateCalory(5000);
        System.out.println("소모 칼로리: " + result + " kcal");
    }

    private static  double calculateCalory(int walk) {
        return 0.02 * walk;
    }
}
