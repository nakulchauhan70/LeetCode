public class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return 1;
        }

        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }
}
