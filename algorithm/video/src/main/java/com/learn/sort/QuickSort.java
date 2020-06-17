package com.learn.sort;

import java.util.Random;

public class QuickSort<E> extends AbstractSortable<E> {
    private Random random = new Random(System.currentTimeMillis());

    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        quickSort(arr,0,arr.length-1);
        this.cmp = null;
    }

    public void quickSort(E[] arr,int start,int end){
        if(start>=end)
            return;
        int index = partition(arr,start,end);
        quickSort(arr,start,index-1);
        quickSort(arr,index+1,end);
    }

    public int partition(E[] arr,int start,int end){
        Tool.exch(arr,start,start + random.nextInt(end-start+1));
        int i = start;
        E mark = arr[start];
        for (int j = start; j <= end; j++) {
            if(greater(mark,arr[j]))
                Tool.exch(arr,++i,j);
        }
        Tool.exch(arr,start,i);
        return i;
    }
    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
