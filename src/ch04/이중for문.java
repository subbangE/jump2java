package ch04;

public class 이중for문 {
    public static void main(String[] args) {
        // for문을 2번 사용하여 구구단 출력
        for (int i=2; i<10; i++) {
            System.out.println(i+"단");
            for (int j=1; j<10; j++) {
                System.out.printf("%d X %d = %d\n",i,j,i * j);
            }
            System.out.println("");
        }
    }
}
