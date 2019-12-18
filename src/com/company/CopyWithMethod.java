package com.company;

public class CopyWithMethod implements CopyStrategy {

    @Override
    public void copy(int[] array1, int[] array2) {
        System.arraycopy(array1,0,array2,0, array1.length);
    }
}
