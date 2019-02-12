package com.stackroute.unittest;


public class Tom {
    public String tomCheck(int n) {

        if (n >= 20 && n <= 30) {
            if (n % 2 == 0) {
                return "jerry";
            } else {
                return "tom";
            }

        }
        return "error";
    }
}
