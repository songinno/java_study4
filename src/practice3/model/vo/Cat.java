package practice3.model.vo;

public class Cat extends Animal{

    private String location;
    private String color;

    //###생성자
    public Cat() {
    }

    public Cat(String name, String kinds, String location, String color) {
        super(name, kinds);
        this.location = location;
        this.color = color;
    }

    //s.g

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //메서드
    @Override
    public void speak() {
        String s = super.toString();
        System.out.println(s);
        System.out.println(location + "에 서식하며, 색상은 " + color + "입니다.");
    }
}
