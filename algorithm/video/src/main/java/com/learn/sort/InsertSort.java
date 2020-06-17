package com.learn.sort;

public class InsertSort<E> implements Sortable<E> {
    private Comparator<E> cmp;
    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(greater(arr[j-1],arr[j])){
                    Tool.exch(arr,j,j-1);
                    break;
                }
            }
        }
        this.cmp = null;
    }

    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
