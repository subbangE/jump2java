package ch04;

public class If_비교연산자 {
    public static void main(String[] args) {
        // 비교연산자 >, <, ==, !=, >=, <=
        int money = 2000;
        if(money >= 3000) {
            System.out.println("택시를 타고 가라");
        }
        else {
            System.out.println("걸어 가라");
        }

        // 논리연산자 &&(and), ||(or), !(not)
        boolean hasCard = true;
        if(money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        }
        else {
            System.out.println("걸어 가라");
        }
    }
}
