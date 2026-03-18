package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FreqCount {
    public static void main(String [] args){
        String s;
        HashMap<Character,Integer> map = new HashMap<>();

        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        s= sc.nextLine();
        for(char c : s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(char key : map.keySet()){
            System.out.println(key +"->"+map.get(key));
        }
    }
}
