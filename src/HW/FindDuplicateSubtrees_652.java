package HW;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees_652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        encode(root, count, ans);
        return ans;
    }

    private String encode(TreeNode root, Map<String, Integer> count, List<TreeNode> ans) {
        if (root == null) return null;
        
        final String encoded = root.val + "#" + encode(root.left, count, ans) + "#" + encode(root.right, count, ans);
        Integer merge = count.merge(encoded, 1, Integer::sum);
        if(count.get(encoded) == 2) ans.add(root);
        return encoded;
    }
}

