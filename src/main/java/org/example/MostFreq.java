package org.example;

import java.util.HashMap;

public class MostFreq {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 1, 3, 2, 2, 1};


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }


        int maxFreq = 0;
        for (int val : map.values()) {
            if (val > maxFreq) maxFreq = val;
        }


        int result = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                if (key < result) result = key;
            }
        }

        System.out.println("Most frequent element: " + result);
    }
}
