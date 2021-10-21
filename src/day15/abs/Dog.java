package day15.abs;

public class Dog extends Pet{

    public Dog(String name, String kind) {
        super(name, kind);
    }

    //오버라이딩 (구체적인 내용을 말해줘야함), 자동완성x

    public void meat() {
        System.out.println("멍멍이는 고기를 사료로 먹어요");
    }

    //////////////////////////////////////////// abstract 이후 추가
    public void inject () {
        System.out.println("강아지는 결핵주사를 맞아요.");
    }
    public void eat() {
        System.out.println("멍멍이는 고기를 사료로 먹어요");
    }

    //////

    @Override
    public void play() {
        System.out.println("강아지랑 산책가기.");
    }

//    public void swim() {} //-> 이거 안됨. 그냥 Pet에 있는 그대로 써야함.

}
