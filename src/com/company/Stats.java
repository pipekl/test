package com.company;

import java.util.ArrayList;
import java.util.List;

class Stats {
    public static void main(String[] args) {
       int value = 360;
       List<Integer> arr = new ArrayList<>();

       for (int i = 1; i <= value; i++) {
           if (value % i == 0) {
               int temp = 0;
               for (int j = 1; j <= i; j++) {
                   if (i % j == 0)
                       temp++;
               }
               if (temp == 2)
               arr.add(i);
           }
       }
        System.out.println(arr);
    }
}
