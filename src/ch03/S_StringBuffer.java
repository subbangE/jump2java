package ch03;

public class S_StringBuffer {
    public static void main(String[] args) {
        // 스트링버퍼 객체를 만들어서 문자열 추가
        StringBuffer sb = new StringBuffer(); // 버퍼 객체 sb 생성
        sb.append("hello"); // 문자열 추가
        sb.append(" "); // 문자열 추가
        sb.append("jump to java"); // 문자열 추가
        String result = sb.toString();
        System.out.println(result);

        // 문자열을 더하기(+)로 추가
        result = "";    // 결과를 빈문자열로
        result += "hello";  // result = result + hello
        result += " ";
        result += "jump to java";
        System.out.println(result);
    }
}
