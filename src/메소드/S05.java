package 메소드;

public class S05 {
    public static void main(String[] args) {
        wear(2400, 2000);
        wear(3800, 1200);
    }

    public static void wear (int hp, int mp) {
        if (hp >= 2000 && mp >= 2000) {
            System.out.printf("아이템 장착 완료!\n");
        } else {
            System.out.printf("아이템을 착용할 수 없습니다.\n");
        }
    }
}
