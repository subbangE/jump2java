package ch05_6;

import org.w3c.dom.ls.LSOutput;

class Animal {
    String name;
    int age;

    Animal() {
        System.out.println("Animal의 디폴트 생성자 입니다.");
    }

    // 생성자 오버로딩: 입력이 다른 여러개의 생성자
    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    public Dog() {
        System.out.println("Dog의 디폴트 생성자!");
    }
}

public class 생성자 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("애니멀2");
        System.out.println(animal2.name);
        Animal animal3 = new Animal("애니멀3", 17);

        Dog dog = new Dog(); // 상속일 경우 자식객체는 부모객체도 함께 생성
    }
}
