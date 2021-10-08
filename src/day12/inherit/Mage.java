package day12.inherit;

public class Mage extends Player {
    //## 필드
    public int mana;

    //### 메서드

    public void fireball() {

    }

    // ###생성자
//    public Mage() {
//        super();
//    }
//-> 다 숨어있음.


    public Mage(String name) {
        super(name);
        this.mana = 50;
    }

    //** 오버라이딩 (alt+insert -> 메서드 재정의)
    @Override
    public void info() {
        super.info();
        System.out.println("마나: " + mana);
    }
}
