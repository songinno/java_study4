package day17.inter;
//(2)-2
public class BullDog extends Dog implements Pet, Huntable {
    //불독은 애완동물이자 사냥도 할 줄 알았으면 좋겠음. -> implements Pet, Huntable
    @Override
    public void hunt(Animal target) {

    }
}
