package 배열과반복문;

public class S08 {
    public static void main(String[] args) {
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};

        int i = topIndex(scores);

        System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
    }

    public static int topIndex(int[] arr) {
        int maxIndex = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
