package com.company;

import java.util.Random;

public class Tables {

    public static void main(String[] args) {

        Tables tables = new Tables();

        int[] array1 = new int[10_000_000];
        int[] array2 = new int[10_000_000];

        tables.fillArrayWithRandomNumbers(array1);

        long time1 = Tables.messureCopyTime(new CopyWithLoop(), array1,array2);
        long time2 = Tables.messureCopyTime(new CopyWithMethod(), array1,array2);

        System.out.printf("Copy table with for loop %d ms,  Copy table with System.arraycopy method %d ms ",time1,time2);
    }


    void fillArrayWithRandomNumbers(int[] array1){
        Random rand = new Random();
        for(int i =0; i< array1.length; i++) {
            array1[i] = rand.nextInt(1000) + 1;
        }
    }

    public static long messureCopyTime(CopyStrategy copyStrategy, int[] array1, int[] array2){
        long start = System.currentTimeMillis();
        copyStrategy.copy(array1,array2);
        long stop = System.currentTimeMillis();
        return stop - start;
    }
}
