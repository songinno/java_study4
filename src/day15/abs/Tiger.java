package day15.abs;

public class Tiger extends Pet{

    public Tiger(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void inject() {
        System.out.println("호랑이는 주사 안맞음");
    }

    @Override
    public void eat() {
        System.out.println("호랑이는 살아있는 것만 먹어요.");
    }

}
