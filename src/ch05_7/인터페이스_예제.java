package ch05_7;

interface Describable {
    // interface는 ~able로 끝남
    String getDescription(); // 추상 메서드
}

class Person implements Describable{
    @Override   // 부모 클래스에 있는 메서드를 재정의할 때 사용
    public String toString() {
        // toString 메서드는 Object에서 객체의 주소출력 (기본)
//        return super.toString();    // super는 부모 객체, this는 내 객체
        return "Person 객체 입니다. 필드변수 없음.";
    }

    @Override
    public String getDescription() {
        return "Person 입니다.";
    }
}

class Computer implements Describable{
    @Override
    public String toString() {
        return "Computer 객체 입니다. 필드변수 없음.";
    }

    @Override
    public String getDescription() {
        return "Computer 입니다.";
    }
}

public class 인터페이스_예제 {
    public static void main(String[] args) {
        // Object 클래스는 모든 클래스의 부모 클래스 (기본)
        Describable[] objs = {new Person(), new Computer()};

        for(Describable obj: objs) {
            System.out.println(obj.getDescription());  // toStirng 메서드는 생략 가능
        }
    }
}
