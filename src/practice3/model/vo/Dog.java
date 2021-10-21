package practice3.model.vo;

public class Dog extends Animal{
    private int weight;

    public Dog() {
    }

    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    //s.g
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //###메서드
    @Override
    public void speak() {
        String s = super.toString();
        System.out.println(s);
        System.out.println("몸무게는" + weight + "kg입니다.");
    }

}
