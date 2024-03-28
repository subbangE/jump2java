package ch07;

import java.util.ArrayList;

public class 조인 extends Thread {
    int seq;

    public 조인(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread strat.");
        try {
            Thread.sleep(1000); // 현재 스레드(작업)을 1초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.seq + " tread end.");   // 스레드 종료
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            Thread t = new 조인(i);
            t.start();  // 스레드 시작
            t.join(); // 메인이 스레드 종료까지 대기
        }

        System.out.println("메인 종료!");
    }
}
