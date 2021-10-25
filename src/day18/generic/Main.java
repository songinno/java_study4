package day18.generic;

import day10.modi.pac1.A;

public class Main {

    public static void main(String[] args) {
        //사과바구니에는 사과만, 복숭아바구니에는 복숭아만 담을거임.
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());
        Peach peach = pb.getPeach();
        System.out.println("peach = " + peach);

        //과일이 300종류면, 바구니도 300개여야함. -> Fruit 인터페이스 만들고 사과랑 복숭아 거기에 걸어줌.
        //Basket 클래스 만들어줌.
//
//        Basket apb = new Basket();
//        apb.setFruit(new Apple());
////        Fruit apple1 = apb.getFruit();
//        Apple apple1 = (Apple)apb.getFruit();
//
//        //그런데,
//        apb.setFruit(new Peach()); // -> 이거 됨. 이러면 안됨. 복숭아가 들어가면 안됨. 잘못된 설계. 다형성을 이용하면 안됨. => generic

        ////////////////////////////////generic////////////////////////////////////
        // Basket 클래스부터 진행.
        Basket<Apple> apb = new Basket<Apple>(); //-> Apple이 class Basket의 F로 들어감.
//        apb.setF(new Peach()); // -> 이제 안됨.
        apb.setF(new Apple());
        Apple f = apb.getF();
        //=> 사과 전용 바구니 만들어짐.

        Basket<Peach> pcb = new Basket<>(); // 오른쪽 Peach 생략 가능.
//        pcb.setF(new Apple()); // 안됨
        pcb.setF(new Peach());
        Peach peach1 = pcb.getF();
        System.out.println("peach1 = " + peach1);
        //=> 복숭아 전용 바구니 만들어짐.
    }

    ////////////////////////////////////////////////////////////////////
    //extends Fruit으로 제한
//    Basket<Water> waterBasket = new Basket<Water>(); // -> water는 못들어옴.

}
