package com.stackroute.unittest;

import java.util.Scanner;

public class Stringcheck {
    public String sCheck(String str) {
        str = str.toLowerCase();
        int vCount = 0, cCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }

        if (cCount > 0 && vCount > 0) {
            return "Vowel Consonant";
        } else if (cCount > 0 && vCount == 0) {
            return "Consonant";
        } else if (vCount > 0 && cCount == 0) {
            return "Vowel";
        } else {
            return "error";
        }

    }
}
