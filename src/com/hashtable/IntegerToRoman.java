package com.hashtable;

//O(N) time | O(1) space
//public class IntegerToRoman {
//    public static void main(String[] args) {
//        System.out.println(intToRoman(3));
//        System.out.println(intToRoman(58));
//        System.out.println(intToRoman(1994));
//    }
//
//    private static Numeral[] numerals = {
//            new Numeral("M", 1000),
//            new Numeral("CM", 900),
//            new Numeral("D", 500),
//            new Numeral("CD", 400),
//            new Numeral("C", 100),
//            new Numeral("XC", 90),
//            new Numeral("L", 50),
//            new Numeral("XL", 40),
//            new Numeral("X", 10),
//            new Numeral("IX", 9),
//            new Numeral("V", 5),
//            new Numeral("IV", 4),
//            new Numeral("I", 1)
//    };
//
//    public static String intToRoman(int num) {
//        String result = "";
//        for (Numeral numeral : numerals) {
//            int noOfSymbols = num / numeral.value;
//
//            if (noOfSymbols != 0) {
//                result += numeral.symbol.repeat(noOfSymbols); //repeat - O(n)
//            }
//            num %= numeral.value;
//        }
//
//        return result;
//    }
//
//    static class Numeral {
//        public String symbol;
//        public int value;
//
//        public Numeral(String symbol, int value) {
//            this.symbol = symbol;
//            this.value = value;
//        }
//    }
//}
