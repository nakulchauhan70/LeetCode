public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(-10));
        System.out.println(reverse(10));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        char temp;
        int i = 0;
        int lastIndex = 0;
        boolean negative = false;

        if (x < 0) {
            i = 1;
            negative = true;
        }

        for (int j = i; j < (chars.length + 1) / 2; j++) {
            temp = s.charAt(j);
            lastIndex = negative ? chars.length - j : chars.length - j - 1;
            chars[j] = chars[lastIndex];
            chars[lastIndex] = temp;
        }

        try {
            return Integer.parseInt(String.valueOf(chars));
        } catch (Exception e) {
            return 0;
        }
    }
}
