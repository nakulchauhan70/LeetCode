public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcodeleeto", "leeto"));
    }

    //"sabutsad", "sad"
    public static int strStr(String haystack, String needle) {
        String s = haystack.replaceFirst(needle, "0");
        return s.indexOf("0");
    }
}