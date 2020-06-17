package com.learn.sort;

public interface Sortable<E> {
    void sort(E[] arr, Comparator<E> cmp);
}
