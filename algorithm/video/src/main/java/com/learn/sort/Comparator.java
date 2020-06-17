package com.learn.sort;

@FunctionalInterface
public interface Comparator<E> {
    int compare(E a,E b);
}
