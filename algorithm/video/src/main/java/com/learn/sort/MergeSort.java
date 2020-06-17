package com.learn.sort;

import java.util.Arrays;

public class MergeSort<E> extends AbstractSortable<E> {
    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        mergeSort(arr,0,arr.length-1);
        this.cmp = null;
    }
    /*
        对[start,end]的元素进行排序
     */
    public void mergeSort(E[] arr,int start,int end){
        if(start>=end)
            return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    /*
        将[start,mid],[mid+1,end]这两个有序数组合并
     */
    public void merge(E[] arr,int start,int mid,int end){
        Object[] tmp = Arrays.copyOfRange(arr,start,end+1);
        int k = start;
        mid = mid - start;
        end = end - start;
        start = 0;

        int i = start;
        int j = mid+1;
        while(i<=mid||j<=end){
            if(i>mid) arr[k++] = (E)tmp[j++];
            else if(j>end) arr[k++] = (E)tmp[i++];
            else if(greater((E)tmp[i],(E)tmp[j])) arr[k++] = (E)tmp[j++];
            else arr[k++] = (E)tmp[i++];
        }
    }

    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
