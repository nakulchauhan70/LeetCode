package com;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        int[] magazineLetterCounter = new int[26];

        //Array for alphabets counter
        for (char c : magazine.toCharArray()) {
            // It is because in ascii if you subtract any char with 'a' , it gives you index of that alphabet.
            // Let us assume a = 0 and z = 25. Now subtract a - a. You got 0 in ASCII,
            magazineLetterCounter[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (magazineLetterCounter[c - 'a'] == 0) {
                return false;
            }

            //Decrement counter of each alphabet of magazine letters
            magazineLetterCounter[c - 'a']--;
        }
        return true;
    }
}
