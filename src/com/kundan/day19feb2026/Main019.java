package com.kundan.day19feb2026;

public class Main019 {
    private String message ="hello from outer class";

    class  InnerClass {
        void display(){
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        Main019 outer = new Main019();

        Main019.InnerClass inner= outer.new InnerClass();
        inner.display();

    }
}
