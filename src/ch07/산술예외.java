package ch07;

public class 산술예외 {
    public static void main(String[] args) {
        int c;  // 블록 밖에서 선언시 블록 안에서 사용 가능
        try {
            // try문에는 에외 가능성이 있는 코드를 넣는다
            c = 4 / 0;  // 0으로 나누면 에외발생(0으로 나눈다는 개념을 모름)
        } catch (ArithmeticException e) {
            c = -1; // 예외가 발생하면 실행됨
        }
        System.out.println("c : " + c);
    }
}
