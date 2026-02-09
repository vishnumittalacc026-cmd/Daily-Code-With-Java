package com.kundan.day09fab2026;

import java.util.HashMap;
import java.util.Map;

public class Main009 {
    public static void main(String[] args){
        //find element that appears more than n/2
        /* input : [2,2,1,1,1,2,2]
           Output : 2
         */
//        int[] nums ={2,2,1,1,1,2,2};
//
//        int count =0;
//        int candidate =0;
//
//        for(int num:nums){
//            if(count ==0){
//                candidate =num;
//            }
//            count += (num == candidate) ? 1: -1;
//        }
//        System.out.println("Majority element: "+candidate);

//        // print element with it highest frequency
//        int[] nums = {2,2,1,1,1,3,3,1,2,2,2,1,1,4,4,1,7,7,6};
//
//        Map<Integer,Integer> frequencyMap = new HashMap<>();
//        //count frequencies
//        for(int num:nums) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//            int maxElement =Integer.MIN_VALUE;
//            int maxFrequency =0;
//
//            for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
//                if(entry.getValue()>maxFrequency){
//                    maxFrequency=entry.getValue();
//                    maxElement = entry.getKey();
//                }
//            }
//        System.out.println("maxElement : "+ maxElement+ " , have frequency: "+maxFrequency);

        //find the longest common prefix among strings
        /* Input : ["flower","flow","flight"]
          Output : "fl"
         */

        String[] strs ={"flower","flow","flight"};

        String prefix = strs[0];

        for(int i=1;i < strs.length; i++){
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
