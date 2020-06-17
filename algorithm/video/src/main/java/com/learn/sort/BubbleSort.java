package com.learn.sort;

public class BubbleSort<E> implements Sortable<E>{

    private Comparator<E> cmp;

    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if(greater(arr[j],arr[j+1])){
                    Tool.exch(arr,j,j+1);
                }
            }
        }
        this.cmp = null;
    }
    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
