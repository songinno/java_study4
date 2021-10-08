package com.kh.example.practice2.model.vo;

public class Product {

    //필드
    public String pName;
    public int price;
    public String brand;

    //생성자
    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    //메서드
    public void information() {
        System.out.println("이름: " + pName);
        System.out.println("가격: " + price + "원");
        System.out.println("브랜드: " + brand);
    }

}
