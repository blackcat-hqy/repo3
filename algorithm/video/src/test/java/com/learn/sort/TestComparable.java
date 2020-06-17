package com.learn.sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

public class TestComparable {
    @Test
    public void testBublle(){
        Evaluator.evaluate(new BubbleSort(),false,100000,1000000);
    }

    @Test
    public void testSelectSort(){
        Evaluator.evaluate(new SelectSort(),false,1000000,10000000);
    }

    @Test
    public void testInsertSort(){
        Evaluator.evaluate(new InsertSort(),true,10,10);
    }

    @Test
    public void testShellSort(){
        Evaluator.evaluate(new ShellSort(),false,100000,1000000);
    }

    @Test
    public void testMergeSort(){
        Evaluator.evaluate(new MergeSort(),false,10*1000*1000,1000*1000*1000);
    }

    @Test
    public void testQuickSort(){
//        QuickSort<Integer> quickSort = new QuickSort<>();
//        quickSort.setCmp((a,b)->a-b);
//        Integer[] arr = Tool.getRandomArray(10,100);
//        quickSort.partition(arr,0,arr.length-1);
//        Tool.printArray(arr);
        Evaluator.evaluate(new QuickSort(),false,10*1000*1000,1000*1000*1000);
    }

}
