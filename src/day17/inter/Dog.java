package day17.inter;

public class Dog extends Animal implements Pet {
    //사료를 먹다
    public void feeding() { // 모든 동물들이 이거 쓰기로 함.
        Pet dog = new Dog(); // 상속처럼 이렇게 가능.
    }

    @Override
    public void play() {

    }
}
