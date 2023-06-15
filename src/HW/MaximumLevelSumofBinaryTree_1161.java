package HW;

import java.util.ArrayDeque;

public class MaximumLevelSumofBinaryTree_1161 {
    public int maxLevelSum(TreeNode root) {
    int max = Integer.MIN_VALUE, ans = 0;
    var queue = new ArrayDeque<TreeNode>();
    queue.offer(root);

    for (var level = 1; !queue.isEmpty(); level++) {
      var sum = 0;

      for (var i = queue.size(); i > 0 ; i--) {
        var node = queue.poll();

        sum += node.val;
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      if (sum > max) {
        max = sum;
        ans = level;
      }
    }
    return ans;
  }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        MaximumLevelSumofBinaryTree_1161 maximumLevelSumofBinaryTree_1161 = new MaximumLevelSumofBinaryTree_1161();
        int maxLevelSum = maximumLevelSumofBinaryTree_1161.maxLevelSum(root);
        System.out.println("The maximum level sum is " + maxLevelSum);
    }
}


