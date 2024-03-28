package 메소드;

public class S08 {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int num) {
        if (num <= 10) {
            return "저층";
        } else if (num >= 11 && num <= 20) {
            return "고층";
        }
        return null;
    }
}
