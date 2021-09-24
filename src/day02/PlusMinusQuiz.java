package day02;

public class PlusMinusQuiz {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x + 5 * 3;
        // = ++x + 15
        /*
        x  y  z
        3
        4  19
        */

        int z = 5 * y-- + x++ - --y;
        // * 먼저, (5 * y--) + x** - --y
        // 5*y = 95 ~> y = 18
        // 95 + x++ - --y
        // 95 + x = 99 ~> x = 5
        // 99 - --y
        // y=17 ~> 99 - 17 = 82
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}
