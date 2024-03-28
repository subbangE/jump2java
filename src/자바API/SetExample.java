package 자바API;

import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Daniel");
        names.add("Brian");
        names.add("Eugene");
        names.add("Adam");
        names.add("Cate");

        System.out.printf("names.size() -> %d\n",names.size());
        System.out.printf("names.first() -> %s\n",names.first());
        System.out.printf("names.last() -> %s\n",names.last());

        System.out.println("== for each 구문 출력 ==");
        for (String str : names) {
            System.out.println(str);
        }
    }
}
