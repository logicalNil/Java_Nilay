package Easy;

import HW.List;

public class Q226 {
         public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;

        StringBuilder range = new StringBuilder();

        int min = nums[0];
        int max = nums[0];

        int prev = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != prev + 1) {
                addRange(range, res, min, max);

                min = nums[i];
                max = nums[i];
            }

            min = Math.min(min, nums[i]);
            max = Math.max(min, nums[i]);

            prev = nums[i];
        }

        addRange(range, res, min, max);

        return res;
    }

    private void addRange(StringBuilder range, List<String> res,
                            int min, int max) {
        range.append(Integer.toString(min));

        if(min != max) {
            range.append("->");
            range.append(Integer.toString(max));
        }

        res.add(range.toString());
        range.setLength(0);
    }
}