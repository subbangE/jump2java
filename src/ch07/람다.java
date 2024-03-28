package ch07;

interface Calulator {
    int sum(int a, int b);  // 추상메서드
}

//class MyCalulator implements Calulator {
//
//    @Override
//    public int sum(int a, int b) {
//        return a+b; // 추상메서드를 구현함
//    }
//}

public class 람다 {
    public static void main(String[] args) {
//        Calulator mc = new MyCalulator();
        Calulator mc = (int a, int b) -> a+b; //람다
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
