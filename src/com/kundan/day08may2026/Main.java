package com.kundan.day08may2026;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        try {
            //get local host
            InetAddress ip = InetAddress.getLocalHost();

            System.out.println("Ip address: "+ ip.getHostAddress());

            System.out.println("Host name: "+ip.getHostName());
        } catch (Exception e){
            e.printStackTrace();
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.print("program time: "+programTime+" ms");
    }
}
