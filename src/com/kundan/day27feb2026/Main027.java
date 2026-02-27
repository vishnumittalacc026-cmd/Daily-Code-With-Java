package com.kundan.day27feb2026;

public class Main027 {
    public static void main(String[] args){
        //start timer
        long startingTime = System.nanoTime();

        int number = 124356798;

//        int sum = String.valueOf(number)
//                        .chars()
//                                .map(Character::getNumericValue)
//                                        .sum();
        //second approach
        int sum=0;
        while(number>0){
            sum = sum+number%10;
            number= number/10;
        }
        System.out.println(sum);

        //end timer
        long endingTime = System.nanoTime();
        //program time
        long timeTaken = (endingTime-startingTime)/1_000_000;

        System.out.println("Time taken: "+timeTaken+"ms");
    }
}
