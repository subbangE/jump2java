package ch07;

public class S_private {
    // 필드 변수들은 기본 private임 (중요 상태 등을 함부로 노출하지 않음)
    private String secret;
    private String name;
    private int age;


    // get: 출력
    private String getSecret() {
        return this.secret;
    }

    // 생성자로 초기화

    public S_private() { // 기본 생성자
    }

    public S_private(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // get set 메서드로 변수에 접근

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // set: 입력
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // private은 같은 클래스 내에서만 사용 가능
    public static void main(String[] args) {
        S_private p = new S_private();
        p.secret = "시크릿";
        System.out.println(p.getSecret());
    }
}
