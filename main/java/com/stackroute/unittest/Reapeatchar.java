package com.stackroute.unittest;


public class Reapeatchar {
    public StringBuffer repeatCh(String Str, int n) {
        String add = Str.substring(Str.length() - n);
        StringBuffer sBuffer = new StringBuffer(15);
        sBuffer.append(Str);
        for (int i = 1; i <= n; i++) {
            sBuffer.append(add);

        }
        return sBuffer;
    }
}
