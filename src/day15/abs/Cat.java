package day15.abs;

public class Cat extends Pet{

    public Cat(String name, String kind) {
        super(name, kind);
    }

    public void inject() {
        System.out.println("고양이는 간염주사를 맞아요.");
    }

    public void eat() {
        System.out.println("고양이는 생선을 사료로 먹어요.");
    }
    // -> cat은 pet의 설계대로 오버라이딩 진행o (필수 기능 추가o)
    //dog는 이름도 meat라하고, 예방접종 기능은 넣지도 않음.
}
