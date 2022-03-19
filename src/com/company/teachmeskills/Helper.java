package com.company.teachmeskills;

import java.util.Locale;

public class Helper {

    static String Task1(String s) {
        String[] str = s.split("-", 4);
        return str[0] + " " + str[2];
    }

    static String Task2(String s) {
        return s.replace("v", "*");
    }

    static boolean Task5(String s) {
        String str = "aBc";
        return s.toLowerCase(Locale.ROOT).contains(str.toLowerCase());
    }

    static boolean Task6(String s) {
        return s.startsWith("555");
    }

    static boolean Task7(String s) {
        return s.endsWith("1a2b");
    }
}
