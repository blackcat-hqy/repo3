package com.learn.sort;

public class SelectSort<E> implements Sortable<E> {

    private Comparator<E> cmp;

    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        int minIndex;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(greater(arr[minIndex],arr[j])){
                    minIndex = j;
                }
            }
            Tool.exch(arr,minIndex,i);
        }
        this.cmp = null;
    }

    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
