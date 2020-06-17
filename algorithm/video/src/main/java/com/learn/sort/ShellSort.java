package com.learn.sort;

public class ShellSort<E> implements Sortable<E> {
    private Comparator<E> cmp;
    @Override
    public void sort(E[] arr, Comparator<E> cmp) {
        this.cmp = cmp;
        for (int i = arr.length/2; i >= 1; i/= 2) {
            for (int j = 0; j < i; j++) {
                for (int k = j; k < arr.length; k+=i) {
                    for (int l = k; l >= i; l-=i) {
                        if (greater(arr[l-i],arr[l])) {
                            Tool.exch(arr, l - i, l);
                            break;
                        }
                    }
                }
            }
        }
        this.cmp = null;
    }

    private boolean greater(E a,E b){
        return cmp.compare(a,b)>0;
    }
}
