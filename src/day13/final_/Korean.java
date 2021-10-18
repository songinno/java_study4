package day13.final_;

public class Korean {
    String name;
    final String sid; //주민번호
    static final String MY_NATION = "대한민국";

    public Korean(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Korean{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                ", nation='" + MY_NATION + '\'' +
                '}';
    }
}
