package 클래스;

public class S03 {
    public static void main(String[] args) {
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        for (int i=0; i<3; i++) {
            malon.mine();
            if (i == 2) {
                System.out.println(malon.toString());
            }
        }

        for (int i=0; i<2; i++) {
            gloria.mine();
            if (i == 1) {
                System.out.println(gloria.toString());
            }
        }
        
    }
}

class Miner {
    String name;
    int coins;

    public Miner(String str) {
        name = str;
        coins = 0;
    }

    public String toString() {
        return String.format("Miner { name: %s, coins: %d }", name, coins);
    }

    public void mine() {
        coins += 1;
    }
}
