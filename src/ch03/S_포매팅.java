package ch03;

public class S_포매팅 {
    public static void main(String[] args) {
        int appleNumber = 7;
        String s = String.format("I eat %d apples.", appleNumber);
        System.out.println(s);

        String appleString = "다섯개";
        String s2 = String.format("나는 사과 %s를 먹는다.", appleString);
        System.out.println(s2);

        // 2개의 값을 넣기
        String s3 = String.format("나는 사과를 %d개 먹고 너는 %s를 먹어라", appleNumber, appleString);
        System.out.println(s3);

        // 정렬과 공백 표현하기
        System.out.println(String.format("%10s", "hi"));
        //공백을 뒤에 주기
        System.out.println(String.format("%-10sJane", "hi"));
        // 소수점 표현 (%f)
        System.out.println(String.format("%.4f", 3.42134943612865));
        // %(총 자리수).(소수점 자리수)f
        System.out.println(String.format("%10.4f",3.42134234));
    }
}
