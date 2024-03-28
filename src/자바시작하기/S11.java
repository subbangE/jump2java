package 자바시작하기;

public class S11 {
    public static void main(String[] args) {
        double jan = 81.36;
        double feb = jan + 0.71;
        double mar = feb - 0.43;

        double average = (jan + feb + mar)/3;
        System.out.printf("%.2fkg", average);
    }
}
