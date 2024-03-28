package 자바시작하기;

public class S05 {
    public static void main(String[] args) {
        int uro = 52;
        int dollar = 32;

        double euroToKwnRate = 1281.62664;
        double dollarToKwnRate = 1091.70306;

        double kwn = (uro * euroToKwnRate) + (dollar * dollarToKwnRate);
        System.out.printf("환전 결과: %.0f원", kwn);
    }
}
