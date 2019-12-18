package com.company;

public class CopyWithLoop implements CopyStrategy {

    @Override
    public void copy(int[] array1, int[] array2) {

        for(int i=0; i < array1.length; i++ ){
            array2[i] = array1[i];
        }
    }
}
