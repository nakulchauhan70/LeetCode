package com.array;

public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toCharArray();

        while (left <= right) {
            boolean leftVowel = isVowel(charArray[left]);
            boolean rightVowel = isVowel(charArray[right]);
            if (leftVowel && rightVowel) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            if (!leftVowel) {
                left++;
            }

            if (!rightVowel) {
                right--;
            }
        }

        return new String(charArray);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}
