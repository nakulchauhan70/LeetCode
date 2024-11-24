package com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NoofSegmentsInaString {

    public int countSegments(String s) {
        return (int) Arrays.stream(s.split(" ")).filter(s1 -> !s1.isEmpty()).map(String::trim).count();
    }

    public static void main(String[] args) {
        System.out.println("     ".trim().length());
    }
}

