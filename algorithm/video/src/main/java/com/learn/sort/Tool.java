package com.learn.sort;

import java.util.Random;

public class Tool {
    public static <E> void printArray(E[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static <E> void exch(E[] arr,int i,int j){
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static Integer[] getRandomArray(final int length,int bound){
        Integer[] array = new Integer[length];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

        return array;
    }
}
