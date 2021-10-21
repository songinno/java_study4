package day15.abs;

public class Main {

    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("뽀삐", "진돗개")
                , new Cat("말썽쟁이", "러시안블루")
                , new Tiger("호돌이", "시베리아 호랑이")
        };

        for (Pet pet : pets) {
            pet.inject();
            pet.eat();
            System.out.println("===");
        }
        //-> 강아지에 대한 내용x, 그런데 프로그램은 잘돌아감. 이게 문제.
        //abstract 이후 제대로 나옴.


        //추상클래스의 역할: 필수로 만들어야 하는 기능을 하위 클래스들에게 강요

//        new Pet(); //-> 안됨 (어짜피 쓸일도 없음)

        Pet t = new Tiger("호오랑이", "백두산 호랭이");  // -> 타입은 Pet으로 가능
        t.play();
        t.swim();





    }//end main

}
