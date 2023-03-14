package HW;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
public class SumRootLeafNumbers_129 {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
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

    public void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        SumRootLeafNumbers_129 sumRootLeafNumbers_129 = new SumRootLeafNumbers_129();
        int sum = sumRootLeafNumbers_129.sumNumbers(root);
        System.out.println("The sum of all root-to-leaf numbers is " + sum);
    }
    }
}

