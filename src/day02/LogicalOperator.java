package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        int x = 10, y = 20;

        boolean result1 = (x != 10) & (++y == 21);
        //                  false         true => false
        boolean result2 = (x == 10) | (++y == 21);
        //                  true          false (위에서 y 21됨, y=22) => true

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /////////////////////////////////////////
        System.out.println("=============================");
        int xx = 10, yy = 20;

        boolean result11 = (xx != 10) && (++yy == 21);
        //                  false         좌항에서 이미 false, 죽어도 true 안나옴. 우항 제낌. ++yy 작동x
        boolean result22 = (xx == 10) || (++yy == 21);
        //                  true          좌항에서 이미 true, 안봐도 true나옴. 우항 제낌. ++yy 작동x

        System.out.println("result11 = " + result11);
        System.out.println("result22 = " + result22);
        System.out.println("xx = " + xx);
        System.out.println("yy = " + yy);

        // => 메모리 절약을 위해 사용.
    }
}
