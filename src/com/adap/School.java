package com.adap;

import com.fr1end.PilotPen;

public class School {
    public static void main(String[] args){
        //PilotPen pp = new PilotPen();

        Pen p = new PenAdapter();
        AssigmentWork aw = new AssigmentWork();
        aw.setP(p);
        aw.writeAssigment("I'm sorry for late submission!");
    }
}
