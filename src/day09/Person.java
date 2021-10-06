package day09;

import day08.Phone;

public class Person {

    String name;
    Phone myPhone;

    // #생성자
    // 단축키 : alt + insdert
    public Person(String name, Phone myPhone) {
        this.name = name;
        this.myPhone = myPhone;
    }
    //문자 보내는 기능
    void contact(Person target, String msg) {
        System.out.printf("%s님이 %s님에게 문자를 전송합니다.\n", name, target.name);
        myPhone.sendMessage(target.myPhone, msg);
    }
    //문자메세지 확인
    void check() {
        myPhone.powerOn();
        myPhone.checkMessages();
    }




}//end class
