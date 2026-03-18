package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class PrepHash {
    public static void main(String [] args){
       int[] arr = {1,23,45,66,78,99,33,66};
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int a : arr){
           if(map.containsKey(a)){
               map.put(a,map.get(a)+1);
           }else{
               map.put(a,1);
           }

       }

       for (int a : arr){
           if (map.get(a)>1){
               System.out.println(a+ "->This is Duplicate in Array !!");
           }
       }
    }

}
