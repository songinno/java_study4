package day18.generic;

public class Basket<F extends Fruit>{ //extends Fruit로 F에 들어올 수 있는 타입을 제한할 수 있다.

//    private Fruit fruit;
//
//    public Fruit getFruit() {
//        return fruit;
//    }
//
//    public void setFruit(Fruit fruit) {
//        this.fruit = fruit;
//    }
//
    ///////////////////////generic////////////////////////////////
    //제네릭: 설계 당시에 필드의 타입을 지정하지 않음. (F는 미지수 같은것.)
    // 객체 생성시, 타입이 결정되며, 해당 타입이 고정됨.
    //관례: 제네릭 타입은 한글자로 함.
    private F f;

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }
}
