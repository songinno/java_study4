package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController{
    private Circle c = new Circle();

    //*원의 넓이 구하기
    public String calcArea(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        // 면적 : PI * 반지름 * 반지름
        double area = Math.PI * radius * radius;
        return c.toString() + "  *area: " + area;
    }
    //*원의 둘레 구하기
    public String calcCircum(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        // 둘레 : PI * 반지름 * 2
        double circum = Math.PI * radius * 2;
        return c.toString() + "  *circum: " + circum;
    }


}
