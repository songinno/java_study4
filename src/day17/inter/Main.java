package day17.inter;
//(4)
public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();

        Tiger tiger = new Tiger();
        tiger.hunt((Animal) dog);

        Shark shark = new Shark();
        shark.hunt(tiger);

        BullDog bullDog = new BullDog();
        bullDog.feeding();
    }
}
