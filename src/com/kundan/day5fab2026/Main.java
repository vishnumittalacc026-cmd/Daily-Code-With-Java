package com.kundan.day5fab2026;

public class Main {
    public static void main(String[] args) {

        // Find the second largest distinct element in the array
        /* Input : {10,5,2,1,88,2,20,11,10}
           Output : 20

           Approach
           ->maintain two variables:
            ->largest
            ->secondLargest
         */


        int[] arr={10,5,2,1,88,2,20,11,10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

//        System.out.println("largest="+largest);
//        System.out.println("secondLargest="+secondLargest);

        for (int num : arr) {
            if(num>largest) {
                secondLargest = largest;
                largest = num;
            } else if(num>secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("no second largest element");
        } else {
            System.out.println("second largest element: " + secondLargest);
        }
    }
}
