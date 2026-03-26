package com.kundan.day26march2026;

public class MainM026 {
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price: prices){
            min = Math.min(min,price);
            profit= Math.max(profit,price-min);
        }
        return profit;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println("Max Profit (prices1): "+maxProfit(prices1));
        System.out.println("Max Profit (prices2): "+maxProfit(prices2));
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
