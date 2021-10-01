package day07;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    // # return문 없는 메서드
    static void multi(int n1, int n2) {
        int result = (n1 + n2) * 10;
        System.out.println("result = " + result); // return문 없음 -> void
    }
    // return이 있는 void도 있음.
    static void sayHello(String name) {
        if(name.length() > 5) {
            System.out.println("이름이 너무 길어요");
            return; // ->단독으로 return만 사용하여, 함수의 종료를 위해 사용하는 경우. 값을 받아가면x.
        }
        System.out.println(name + "님 하이~");
    }

    // 모든 메서드의 리턴값은 반드시 1개.
    //2개의 정수를 받아서 덧,뺄,곱,나눗셈 결과를 다 리턴받고 싶음. -> 배열 하나로 묶어서 리턴.
    static int[] operateAll (int n1, int n2) {
//        int plus = n1 + n2;
//        int minus = n1 - n2;
//        int multi = n1 * n2;
//        int divide = n1 / n2; // 변수는 재활용에 목적이 있어서 이렇게 일일이 쓰는것x
//        int[] results = {n1 + n2, n1 - n2, n1 * n2, n1 / n2}; // results도 x
          return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }




    ////////////////////////main/////////////////////////////////////

    public static void main(String[] args) {
        int total = add(10, 20);

        // void타입 메서드는 단독호출해서 사용. (변수에 담을 수 없음. 타입이 뭔지 몰라서)
        multi(10, 20);

        System.out.println();

        sayHello("김철수");
        sayHello("fvadmkladvlkmvlmlkxvkcmlvkmlkmvlkmkeqmvkfqmeqkev");
        //이름 제한하고 싶음 너무 길어서.


    }//end main

}
