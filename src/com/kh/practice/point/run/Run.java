package com.kh.practice.point.run;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;

public class Run {
    public static void main(String[] args) {
        CircleController cc = new CircleController();
        String s = cc.calcArea(5, 5, 5);
        System.out.println(s);

        String circum = cc.calcCircum(5, 5, 5);
        System.out.println(circum);


    }
}

