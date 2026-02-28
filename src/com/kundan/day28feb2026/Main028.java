package com.kundan.day28feb2026;

public class Main028 {
    public static void main(String[] args){
        //Start_timer
        long startTimer= System.nanoTime();

//        String word = "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis";
//        String reversed_word= new StringBuilder(word)
//                .reverse()
//                .toString();
//        System.out.println(reversed_word);

//        char[] chars =new char[100_000_000];
//        java.util.Arrays.fill(chars,'A');
//        String word = new String(chars);
//
//        String reversedWord = new StringBuilder(word)
//                .reverse()
//                        .toString();
//
//        System.out.println("word length: "+word.length());
//        System.out.println(reversedWord);
//        //Total time: 262 ms for one million character
        //Total time: 1223 ms for ten million character

        char[] chars = new char[100_000_000];
        java.util.Arrays.fill(chars,'k');
        String word = new String(chars);
        StringBuilder reversedWord = new StringBuilder(word);

        StringBuilder reversedFinalWord = new StringBuilder("");
        for (int i = reversedWord.length() - 1; i >= 0; i--){
            reversedFinalWord.append(reversedWord.charAt(i));
        }
        System.out.println(reversedFinalWord);
//        //Total time: 260 ms for one million character
//        //Total time: 2107 ms for 10 million character
        //end_timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Total time: "+programTime+" ms");
    }
}
