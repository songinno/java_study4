package com.kh.example.practice2.model.vo;

public class Product {

    public String pName;
    public int price;
    public String brand;

    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    public void information() {
        System.out.printf("제품명: %s, 가격: %d원, 브랜드: %s\n"
                            , this.pName, this.price, this.brand);
    }
}
