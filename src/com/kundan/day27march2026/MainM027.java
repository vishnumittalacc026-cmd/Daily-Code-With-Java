package com.kundan.day27march2026;

public class MainM027 {
    public static int maxSubArray(int[] nums){
        int max = nums[0], current = nums[0];

        for(int i=0; i<nums.length; i++){
            current = Math.max(nums[i], current+nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        // Maximum subarray(Kadane's)
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: "+maxSubArray(nums));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
