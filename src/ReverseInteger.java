//VIMP
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse2(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(-10));
        System.out.println(reverse(10));
    }

    public static int reverse2(int x) {
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

    public static int reverse(int x) {
        long reverse = 0;
        int rem;
        int num = x;

        //-123%10 => -3(below code), 7(google)
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reverse;
    }

}
