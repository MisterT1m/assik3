package com.adap;

import com.fr1end.PilotPen;
public class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str){
        pp.mark(str);
    }
}
