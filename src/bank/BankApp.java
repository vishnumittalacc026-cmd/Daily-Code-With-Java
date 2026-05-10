package bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){

        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
