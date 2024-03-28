package ch03;

public class S_형변환 {
    public static void main(String[] args) {
        String num = "123";

        // 문자열을 숫자로 변환
        int n = Integer.parseInt(num);
        double d = Double.parseDouble(num);

        System.out.println(n+100);
        System.out.println(d);

        // 숫자를 문자열로 변환
        String num2 = "123" + n;   // 문자열 + 숫자 => 문자열
        System.out.println(num2);

        // 메소드를 사용해서 문자열 변환
        String num3 = String.valueOf(123);
        String num4 = Integer.toString(123);
        System.out.println(num3);
        System.out.println(num4);

        // 소수점이 있는 문자열 변환
        String num5 = "123.456";
        double d1 = Double.parseDouble(num5);
        System.out.println(d1);

        // 정수와 실수 사이의 형 변환
        int n2 = 123;
        double d2 = n2; // 정수를 실수로 바꿀때 자동 변환
        System.out.println(d2);

        double d3 = 123.456;
        // int n3 = d3; 정수 -> 실수 가능하지만, 실수 -> 정수 불가능
        int n3 = (int)d3; // 강제 변환
        System.out.println(n3);

        // 실수형태 문자열을 정수로 변환시 주의
        String num6 = "123.456";
//      int n6 = Integer.parseInt(num6); 정수로 하면 에러남
        Double n6 = Double.parseDouble(num6);

    }
}
