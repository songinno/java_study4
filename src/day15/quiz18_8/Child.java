package day15.quiz18_8;

public class Child extends  Parent{
    public Child(String name) {
//        this.name = name; <- 이게 틀림.
        super(name); // 이렇게 고쳐주면됨.
    }
}
