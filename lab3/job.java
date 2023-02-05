package com.adhithiya.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class job {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        arr[0]=in.nextInt();
        for (int i = 0; i<9; i++) {
            arr[i + 1] += arr[i] * 2;
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum+arr[9]);

    }
}
