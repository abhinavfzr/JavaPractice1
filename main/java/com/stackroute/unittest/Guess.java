package com.stackroute.unittest;

public class Guess {
    public String guess(int l1, int l2, int number) {
        if (number < l1) {
            return "Number guessed is less than original number";
        } else if (number > l2) {
            return "Number guessed is more than original number";
        } else if (number < l2 && number > l1) {
            return "Number guessed matches the original number";
        }
        return "error";

    }
}
