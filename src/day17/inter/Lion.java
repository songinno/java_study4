package day17.inter;
//(5)-1 인터페이스끼리 상속
public class Lion extends Animal implements Wild {
    @Override
    public void play() {

    }

    @Override
    public void hunt(Animal target) {

    }

    @Override
    public void attack(Animal target) {

    } // 보통 폭력적이면 사냥할 수 있음.
    //근데 폭력적인데 사냥 못하는 애도 있고, 사냥할줄아는데 폭력적이지 않은 애도 있음.
}
