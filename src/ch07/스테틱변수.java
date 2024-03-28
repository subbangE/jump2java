package ch07;

class Counter {
    // static 변수는 처음 한번만 만들어지고 공유됨
    static int count = 0;

    public Counter() {
        count++;    // 객체 생성시 카운트 값을 증가
        System.out.println(this.count);
    }
}

public class 스테틱변수 {
    public static void main(String[] args) {
        // static 변수는 객체 없이 사용 가능하고 다른 객체들도 공유함
        System.out.println(Counter.count);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}