package ch03;

public class S_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello");
        System.out.println(sb.toString()); // 원하는 위치에 문자열 입력
    }
}
