package day16;

import java.util.Arrays;

public class Lotto {

    private int[] lotto;

    public Lotto() {
        lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int rn = (int) (Math.random() * 45 + 1);
            lotto[i] = rn;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    //로또 당첨번호 만들기.
    public static int[] createLotto() {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int rn = (int) (Math.random() * 45 + 1);
            lotto[i] = rn;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        return lotto;
    }
    //보너스번호 만들기
    public static int createBonusNum(int[] win) {
        return 0;
    }

    public void information() {
        System.out.println("로또번호: " + Arrays.toString(lotto));
    }
}
