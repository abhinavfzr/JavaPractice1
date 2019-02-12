package com.stackroute.unittest;

public class SortNum {
    public String dsort(int number[], int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (number[i] < number[j]) {
                    int a;
                    a = number[i];
                    number[i] = number[j];
                    number[j] = a;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Sorted number in non-increasing order : " + number[i]);
            if (number[i] % 2 == 0) {
                k += number[i];
            }
        }
        System.out.println(" Sum of even numbers : " + k);
        if (k > 15) {
            return "true";
        } else {
            return "false";
        }

    }

}



