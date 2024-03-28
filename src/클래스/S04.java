package 클래스;

public class S04 {
    public static void main(String[] args) {
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체의 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
        System.out.printf("정육면체의 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());

    }
}

class Cube {
    int length;

    public Cube (int i) {
        length = i;
    }

    public int volume() {
        return length * length * length;
    }

    public int surfaceArea() {
        return 6 * length * length;
    }
}