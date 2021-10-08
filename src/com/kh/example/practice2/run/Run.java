package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
    public static void main(String[] args) {

        Product car = new Product("그랜져", 5000, "현대");
        car.information();
    }
}
