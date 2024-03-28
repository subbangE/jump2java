package ch03;

public class S_배열 {

    public static void main(String[] args) {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 배열에서 특정 값을 구하기
        System.out.println(weeks[3]); // 배열의 인덱스로 해당 값을 가져옴

        // 배열길이: 이름.length
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        // 배열의 흔한 오류(배열 길이를 잘못 판단)
        System.out.println(weeks[weeks.length-1]);

        // 정수 배열
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);
    }
}
