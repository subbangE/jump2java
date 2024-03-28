package 자바API;

import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        Menu gimbap = new Menu("김밥", 2000, 57);
        Menu donkkas = new Menu("돈까스", 6000, 29);
        Menu negmeon = new Menu("냉면", 5000, 34);

        Store store = new Store();

        store.add(gimbap);
        store.add(donkkas);
        store.add(negmeon);

        System.out.printf("총 매출: %d원", store.totalSales());
    }
}


class Store {
    private ArrayList<Menu> list;

    public Store() {
        this.list = new ArrayList<Menu>();
    }

    public void add(Menu menu) {
        list.add(menu);
    }

    public int totalSales() {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (list.get(i).getPrice() * list.get(i).getCount());
        }
        return total;
    }
}

class Menu {
    private String name;
    private int price;
    private int count;

    public Menu(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}