package com.stackroute.unittest;

public class Palindrome {
    public int PalindromeCheck(int n) {
        int r, sum = 0, temp, k = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            if (r % 2 == 0) {
                k += r;
            }
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum && k > 25) {
            System.out.println(temp + " is palindrome and the sum of even numbers is greater than 25");
        } else if (temp == sum && k < 25) {
            System.out.println(temp + " is palindrome and the sum of even numbers is less than 25");
        } else {
            System.out.println(temp + " is not palindrome");


        }
            return  sum;
    }
}
