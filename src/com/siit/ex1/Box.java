package com.siit.ex1;

public class Box<TipDeData> {
    TipDeData obj;

    public Box(TipDeData obj) {
        this.obj = obj;
    }

    public TipDeData getObject() {
        return obj;
    }
}
