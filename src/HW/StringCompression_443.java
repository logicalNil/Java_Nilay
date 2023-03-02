package HW;

public class StringCompression_443 {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while (j < chars.length) {
            int count = 0;
            char c = chars[j];
            while (j < chars.length && chars[j] == c) {
                j++;
                count++;
            }
            chars[i++] = c;
            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[i++] = ch;
                }
            }
        }
        return i;
    }

    public static void main(String[] args) {
        StringCompression_443 obj = new StringCompression_443();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(obj.compress(chars));
    }
}
