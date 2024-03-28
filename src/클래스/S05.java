package 클래스;

public class S05 {
    public static void main(String[] args) {
        Item storm = new Item("스톰 브레이커", 600);
        Item gauntlet = new Item("인피니티 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡틴아메리카의 방패", 50);

        Item[] items = {storm, gauntlet, bow, shield};

        for (int j=0; j<items.length; j++) {
            System.out.println(items[j].toString());
        }

    }
}

class Item {
    String name;
    int power;

    public Item(String str, int i) {
        name = str;
        power = i;
    }

    public String toString() {
        return String.format("Item { name: %s, power: %d }", name, power);
    }
}