package ch07;

public class 스레드 extends Thread {
    int seq;

    public 스레드(int seq) {
        this.seq = seq;
    }

    // 스레드의 run 메소드가 스레드 시작시 실행됨

    public void run() {
        System.out.println(this.seq + " thread strat.");
        try {
            Thread.sleep(1000); // 현재 스레드(작업)을 1초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.seq + " tread end.");   // 스레드 종료
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new 스레드(i);
            t.start();
        }
        System.out.println("main end.");    // 메인종료
    }
}
