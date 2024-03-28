package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        // foreach문은 리스트에서 아이템을 한개씩 꺼내어 반복한다.
        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
