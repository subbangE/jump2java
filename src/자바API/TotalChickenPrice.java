package 자바API;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

//      Chicken c1 = new Chicken("로스트 치킨", 9900);
//      order.add(c1)
//      위에랑 밑에 줄이랑 똑같음
        order.add(new Chicken("로스트 치킨",9900));
        order.add(new Chicken("파닭 치킨",12900));
        order.add(new Chicken("마늘아 치킨",13900));

        int sum = 0;

        for (int i = 0; i < order.size(); i++ ) {
            sum += order.get(i).getPrice();
        }
//      위 for문이랑 동일 밑에는 for each문 사용
//      for(Chicken c : order) {
//          sum = sum + c.getPrice();
//      }

        System.out.printf("총합: %d원\n", sum);
    }
}

class Chicken {
    private String name;
    private int price;

    public Chicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
