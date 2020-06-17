package com.learn.sort;

public class Evaluator {
    public static void evaluate(Sortable s,boolean doPrint,int length,int bound){
        Integer[] arr = Tool.getRandomArray(length,bound);

        if(doPrint){
            System.out.println("排序前：");
            Tool.printArray(arr);
        }

        long start = System.currentTimeMillis();
        s.sort(arr,(a,b)->((Integer)a).compareTo((Integer)b));
        long cost = System.currentTimeMillis() - start;

        if(doPrint){
            System.out.println("排序后：");
            Tool.printArray(arr);
        }

        System.out.println("总耗时："+cost+"ms");
    }
}
