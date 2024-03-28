package ch03;

import java.util.ArrayList;

public class S_리스트 {
    public static void main(String[] args) {
        // 문자열 리스트
        ArrayList<String> pitches = new ArrayList();

        // add: 추가
        pitches.add("138"); // 0
        pitches.add("129"); // 1
        pitches.add("142"); // 2

        // get: 값을 가져옴
        System.out.println(pitches.get(1));

        // size: 아이템 갯수 리턴
        System.out.println(pitches.size());

        // contains: 리스트안에 아이템이 있으면 참 없으면 거짓
        System.out.println(pitches.contains("142"));

        // remove(객체): 값을 제거 리턴 true(제거됨)
        System.out.println(pitches.remove("129"));  // true
        // remove(인덱스): 제거 후, 그 값이 리턴
        System.out.println(pitches.remove(0));  // 138
        // 제거후 남은 값은 ?
        System.out.println(pitches.get(0)); // 142
    }
}
