package HW;

import java.util.*;
import java.util.function.BiPredicate;

public class SimilarStringGroups_839 {
     public int numSimilarGroups(String[] strs) {
        BiPredicate<String, String> func = (x, y) -> {
            if (x.equals(y)) {
                return true;
            }
            int nx = x.length(), ny = y.length();
            if (nx != ny) {
                return false;
            }
            int count = 0;
            for (int i = 0; i < nx; ++i) {
                if (x.charAt(i) != y.charAt(i)) {
                    count++;
                    if (count > 2) {
                        return false;
                    }
                }
            }
            return count == 2;
        };

        Map<String, Set<String>> mp = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (func.test(strs[i], strs[j])) {
                    mp.computeIfAbsent(strs[i], k -> new HashSet<>()).add(strs[j]);
                }
            }
        }
        Set<String> group = new HashSet<>();
        int groups = 0;
        for (String str : strs) {
            if (((HashSet<?>) group).contains(str)) {
                continue;
            }
            Set<String> visited = new HashSet<>();
            Stack<String> ss = new Stack<>();
            ss.push(str);
            while (!ss.empty()) {
                String curr = ss.pop();
                if (visited.contains(curr)) {
                    continue;
                }
                visited.add(curr);
                for (String ft : mp.getOrDefault(curr, Collections.emptySet())) {
                    ss.push(ft);
                    group.add(ft);
                }
            }
            groups++;
        }
        return groups;
    }
}
