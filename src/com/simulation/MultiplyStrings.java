package com.simulation;

import java.math.BigDecimal;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return null;
        }

        BigDecimal n1 = new BigDecimal(num1);
        BigDecimal n2 = new BigDecimal(num2);

        BigDecimal prod = n1.multiply(n2);

        return String.valueOf(prod);
    }
}