package 자바API;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.print("생성 번호: ");
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }
}

class LottoMachine {
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = generate();
    }

    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random rand = new Random();

//        for (int i = 0; i < pickedNumbers.length; i++) {
//            pickedNumbers[i] = rand.nextInt(45) + 1;
//        }

//        for (int k = 0; k < pickedNumbers.length; k++) {
//            int randnum = rand.nextInt(45) + 1;
//            for (int j = 0; j < pickedNumbers.length; j++) {
//                if (pickedNumbers[j] == randnum) {
//                    k--;
//                    break;
//                }
//            }
//            pickedNumbers[k] = randnum;
//        }

        for (int i = 0; i < pickedNumbers.length; i++) {
            int randnum = rand.nextInt(45) + 1;
            for (int j = 0; j < pickedNumbers.length; j++) {
                if (pickedNumbers[j] == randnum) {
                    i--;
                    break;
                }
            }
            if(pickedNumbers[i] == 0){
                pickedNumbers[i] = randnum;
            }
        }

        return pickedNumbers;
    }

    public int[] getLottoNumbers() {
        return LottoNumbers;
    }
}