package com.kundan.day06fab2026;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main006 {
    public static void main(String[] args) {
        // move all zeroes to end
        /* i/p :[0,1,0,3,12]
           o/p :[1,3,12,0,0]
         */
        int[] arr = {0, 9, 0, 3,11,4,0,2,0,0, 12};

        int index = 0;
        //here non zero elements will move forward
        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}