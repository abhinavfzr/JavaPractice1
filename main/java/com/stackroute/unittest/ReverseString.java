package com.stackroute.unittest;

import java.util.Scanner;

public class ReverseString {
    public String reverseStr(String source) {
        Scanner sc = new Scanner(System.in);
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }

}

