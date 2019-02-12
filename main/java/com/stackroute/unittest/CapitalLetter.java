package com.stackroute.unittest;

import java.util.Scanner;

public class CapitalLetter {
    public String capitalL(char c) {
        if (Character.isUpperCase(c)) {
            return "Capital letter";
        } else if (Character.isLowerCase(c)) {
            return "Lower case letter";
        } else if (Character.isDigit(c)) {
            return "Digit";
        } else {
            return "Special Character";
        }
    }
}
