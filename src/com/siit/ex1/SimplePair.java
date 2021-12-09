package com.siit.ex1;

public class SimplePair<Tip1, Tip2> implements Pair<Tip1, Tip2> {
    Tip1 key;
    Tip2 value;

    public SimplePair(Tip1 key, Tip2 value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Tip1 getKey() {
        return key;
    }

    @Override
    public Tip2 getValue() {
        return value;
    }
}
