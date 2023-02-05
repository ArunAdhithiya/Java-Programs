package com.adhithiya.lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i;
        double mode = 0;
        double sum = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("enter double values:");
            al.add(in.nextDouble());
        }
        for (i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        sum /= al.size();
        al.add(sum);
        double sd = 0;
        int maxcount = 0;
        double element_having_max_freq = 0;
        for (i = 0; i < al.size(); i++) {
            int count = 0;
            for (int j = 0; j < al.size(); j++) {
                if (al.get(i) == al.get(j)) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = al.get(i);
            }
            mode = element_having_max_freq;
            al.add(mode);
            for(i=0;i<al.size();i++) {
                for(int j=0;j<al.size();j++) {
                    sd = sd + ((j - sum) / 5);
                }
            }
            sd = Math.sqrt(sd);
            al.add(sd);
            System.out.println(al);
        }
    }
}
