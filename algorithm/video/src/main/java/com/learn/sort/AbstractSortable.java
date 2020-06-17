package com.learn.sort;

public abstract class AbstractSortable<E> implements Sortable<E> {
    protected Comparator<E> cmp;

    public void setCmp(Comparator<E> cmp){
        this.cmp = cmp;
    }
}
