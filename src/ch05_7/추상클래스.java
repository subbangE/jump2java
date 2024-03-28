package ch05_7;

// 추상클래스는 클래스 앞에 abstract이 붙음
abstract class GameObject {
    String name;
    void game() {
        System.out.println("게임시작!");
    }
    abstract void describe(); // 추상메서드
}

class Player extends GameObject {
    @Override
    void describe() {
        System.out.println("플레이어 입니다.");
    }
}

class Monster extends GameObject{
    @Override
    void describe() {
        System.out.println("몬스터 입니다.");
    }
}

public class 추상클래스 {
    public static void main(String[] args) {
        // Player 객체와 Monster 객체는 GameObject 를 상속했으므로 선언 가능
        GameObject[] objs = {new Player(), new Monster()};

        for (GameObject obj: objs) {
            obj.game();
            System.out.println(obj);    // 객체 주소 toString 메서드
            obj.describe();     // 추상메서드 구현
        }
    }
}
