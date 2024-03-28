package 배열과반복문;

public class S07 {
    public static void main(String[] args) {
        int[] bacteriaCountLogs = new int[10];

        writeLog(bacteriaCountLogs);

        printLog(bacteriaCountLogs);
    }

    public static void writeLog(int[] logs) {
        for (int i=0; i< logs.length; i++) {
            logs[i] = (int) Math.pow(2, i);
        }
    }

    public static void printLog(int[] arr) {
        System.out.printf("[");
        for (int i=0; i< arr.length; i++) {
            System.out.printf("%d", arr[i]);
            if (i != arr.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.printf("]");
    }
}
