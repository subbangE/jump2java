package 클래스;

public class S01 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.r = 4;
        c.h = 5;

        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
    }
}

class Cylinder {
    int r;
    int h;
    Double getVolume() {
        return r * r * Math.PI * h;
    }

    Double getArea() {
        return ((2 * r * r * Math.PI) + (2 * r * h * Math.PI));
    }
}