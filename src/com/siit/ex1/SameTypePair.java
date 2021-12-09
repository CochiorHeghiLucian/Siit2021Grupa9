package com.siit.ex1;

public class SameTypePair<T1> implements Pair<T1, T1> {
    T1 key;
    T1 value;

    public SameTypePair(T1 key, T1 value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T1 getKey() {
        return null;
    }

    @Override
    public T1 getValue() {
        return null;
    }
}
