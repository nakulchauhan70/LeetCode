package com.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsofaString {
    public static String reverseWords(String s) {
        List<String> collect = Arrays.stream(s.split(" ")).filter(s1 -> !s1.isEmpty()).collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ", collect);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" the sky  is     blue "));
    }
}
