package 메소드;

public class S10 {
    public static void main(String[] args) {
        double w = 81.6;
        double t = 1.76;

        double bmi = calculate(w, t);

        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과: %s입니다\n", result(bmi));
    }

    public static double calculate(double weight, double tall) {
        return weight / (tall * tall);
    }

    public static String result(double bmi) {
        String result = "";
        if (bmi >= 30) {
            return "비만";
        } else if (bmi >= 25 && bmi < 30) {
            return "과체중";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "정상";
        } else {
            return "저체중";
        }
    }
}
