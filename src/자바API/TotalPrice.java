package 자바API;

import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        Cart myCart = new Cart();

        Cart.Item item1 = myCart.new Item("스프라이프셔츠", 49900);
        Cart.Item item2 = myCart.new Item("슬림 면바지", 58900);
        Cart.Item item3 = myCart.new Item("스니커즈", 46900);

        myCart.add(item1);
        myCart.add(item2);
        myCart.add(item3);

        System.out.printf("총합: %d원", myCart.totalPrice());
    }
}

class Cart {
    private ArrayList<Item> list;

    public Cart() {
        this.list = new ArrayList<Item>();
    }

    public void add(Item item) {
        list.add(item);
    }

    public int totalPrice() {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getPrice();
        }
//        for(Item item:list) {
//            sum += item.getPrice();
//        }

        return sum;
    }

    class Item {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
