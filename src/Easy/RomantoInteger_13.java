package Easy;

public class RomantoInteger_13 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && getValue(s.charAt(i)) > getValue(s.charAt(i - 1))) {
                res += getValue(s.charAt(i)) - 2 * getValue(s.charAt(i - 1));
            } else {
                res += getValue(s.charAt(i));
            }
        }
        return res;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomantoInteger_13 ri = new RomantoInteger_13();
        System.out.println(ri.romanToInt("MMMCXXIV"));
    }
}

