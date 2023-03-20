public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuffer res = new StringBuffer();

        for (int i = 0; i < numRows; i++) {
            int increment = 2 * (numRows - 1);

            for (int j = i; j < s.length(); j += increment) {
                res.append(s.charAt(j));

                if ((i > 0 && i < numRows - 1) && (j + increment - 2 * i < s.length())) {
                    res.append(s.charAt(j + increment - 2 * i));
                }
            }
        }

        return res.toString();
    }
}
