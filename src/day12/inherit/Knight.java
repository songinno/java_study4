package day12.inherit;

public class Knight extends Warrior{
    public Knight() {
//        super(); //-> 얘도 숨어있음.
        System.out.println("나이트 객체 생성.");
        this.name  = "기사왕";
        this.rage = 100;
        info();
        //-> Player꺼, Warrior꺼 다 쓸 수 있음. 줄줄이 상속됨.

    }
}
