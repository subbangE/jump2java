package ch03;

import java.util.Arrays;
import java.util.HashSet;

public class S_집합메서드 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // add로 추가하기
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);

        // addAll로 여러개 추가하기
        set.addAll(Arrays.asList("HTML", "CSS", "JS"));
        System.out.println(set);

        // remove 제거
        set.remove("To");
        System.out.println(set);
    }
}
