package 자바API;

public class KnightTest {
    public static void main(String[] args) {
        Knight knight1 = new Knight("돈키호테", 30);
        System.out.println("[객체 생성]");
        System.out.printf("\t%s\n", knight1.toString());

        // 체력증가 hp +30
        knight1.setHp(knight1.getHp() + 30);
        System.out.println("[체력 증가 + 30]");
        System.out.printf("\t%s\n", knight1.toString());
    }
}

class Knight {
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String toString() {
        return String.format("Knight { name: %s, hp: %d }", this.name, this.hp);
    }
}