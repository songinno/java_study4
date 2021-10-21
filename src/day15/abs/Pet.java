package day15.abs;

public abstract class Pet { // final과 abstract는 완전 상반된 개념. 둘이 같이 못씀.

    private final String name;
    private final String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    //###메서드###
    //1. 예방접종 맞기
//    public void inject() {
//        System.out.println("예방접종을 맞아요~");
//    }
    //=>
    public abstract void inject();
    //2. 사료 먹기
//    public void eat() {
//        System.out.println("사료를 먹어요");
//    }
    //=>
    public abstract void eat();

    //위의 2개는 필수 기능 (안하면 죽음) =>강제해야함(dog에서처럼 eat 말고 meat이라고 하면 오류나게)

    //3. 놀기
    public void play() {
        System.out.println("애완동물은 혼자서도 잘놀아요");
    }
    //-> abstract 메서드만 만들 수 있는 것은x
    //-> 이런경우는 필수가 아닌 경우. abstract로 강요하지 않아도 됨.
    // -> 오버라이딩해서 수정 조금 해서 쓰거나, 아님 그대로 써도 됨.

    //4. 수영하기
    public final void swim() {
        System.out.println("애완동물은 헤엄치는 걸 좋아해요");
    }
    //*final -> 오버라이딩 불가 -> 수정불가. => 쓸거면 수정하지 말고 이거 이대로 쓰라는 의미.






}
