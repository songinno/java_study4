package day07;

public class Parameter {
    // @ 2개의 정수의 합
    static int add(int n1, int n2) {
        return n1+ n2;
    }

    // @ 랜덤으로 음식 하나를 골라서 리턴하는 메서드
    static String chooseRandomFood() {
        String[] foods = {"볶음밥", "치킨", "목살", "파스타"};

        int rn = (int) (Math.random()* foods.length);
        return foods[rn];
    }
    // -> parameter 필요없는 메서드.

    //@ n개의 정수의 합 (*배열 이용)
    static int addN(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }
        //spread (...)
    static int addN2(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }





    public static void main(String... args) { // main도 함수. ... 가능

        int result = add(1, 2);
        System.out.println("result = " + result);

        String result2 = chooseRandomFood();
        System.out.println("food = " + result2);

        int result3 = addN(new int[]{5, 10, 15, 20});
        System.out.println("result3 = " + result3);

        int result4 = addN2(5, 10, 15, 20); // result3이랑 똑같이 묶어서 써도 가능.
        System.out.println("result4 = " + result4);
    }
}
