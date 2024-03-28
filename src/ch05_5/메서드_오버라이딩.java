package ch05_5;

class Cat {
    void sound() {
        System.out.println("야옹~~");
    }
}

class HouseCat extends Cat {
    // 오버라이딩: 부모 클래스의 메서드를 다시 작성하여 덮어씀
    void sound() {
        System.out.println("냐옹~~");
    }
}

class RoadCat extends Cat {
    void sound() {
        System.out.println("캬옹~~");
    }
}

public class 메서드_오버라이딩 {
    public static void main(String[] args) {
        HouseCat cat = new HouseCat();  // 집고양이
        RoadCat cat2 = new RoadCat();   // 길고양이
        cat.sound();
        cat2.sound();
    }
}
