package HW;

import javax.swing.tree.TreeNode;

public class SumRootLeafNumbers_129{

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }

    }
}
