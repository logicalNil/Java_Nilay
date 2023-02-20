public class Permutation2Str {
    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[128];
        int req = s1.length();

        for (final char c : s1.toCharArray())
            ++count[c];

        for (int r = 0; r < s2.length(); ++r) {
            if (--count[s2.charAt(r)] >= 0)
                --req;//decrement
            if (r >= s1.length()) // now  this window is oversized
                if (++count[s2.charAt(r - s1.length())] > 0)
                    ++req;//increment
            if (req == 0)
                return true;
        }
        return false;
    }
}
