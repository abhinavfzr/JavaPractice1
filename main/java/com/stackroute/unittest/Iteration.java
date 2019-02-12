package com.stackroute.unittest;

import java.util.Scanner;

public class Iteration {
    public int[] iteration(int n) {
        int[] arr = new int[6];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }
}
