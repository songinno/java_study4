package com.kh.hw.person.run;

import com.kh.hw.person.contoroller.PersonController;
import com.kh.hw.person.view.PersonMenu;

public class Run_Main {
    public static void main(String[] args) {
        PersonController pc = new PersonController();
        PersonMenu pm = new PersonMenu();

        pm.mainMenu();
    }
}
