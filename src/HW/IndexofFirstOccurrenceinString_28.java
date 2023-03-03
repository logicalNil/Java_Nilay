package HW;

import org.jetbrains.annotations.NotNull;

public class IndexofFirstOccurrenceinString_28 {
    public int strStr(String haystack, @NotNull String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == needle.length()) return i - j;
        return -1;
    }

    public static void main(String[] args) {
        IndexofFirstOccurrenceinString_28 obj = new IndexofFirstOccurrenceinString_28();
        String haystack = "hello";
        String needle = "ello";
        System.out.println(obj.strStr(haystack, needle));
    }
}
