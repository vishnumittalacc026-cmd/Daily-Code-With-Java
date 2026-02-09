package com.kundan.day09fab2026;

public class Main009 {
    public static void main(String[] args){
        //find element that appears more than n/2
        /* input : [2,2,1,1,1,2,2]
           Output : 2
         */
        int[] nums ={2,2,1,1,1,2,2};

        int count =0;
        int candidate =0;

        for(int num:nums){
            if(count ==0){
                candidate =num;
            }
            count += (num == candidate) ? 1: -1;
        }
        System.out.println("Majority element: "+candidate);
    }
}
