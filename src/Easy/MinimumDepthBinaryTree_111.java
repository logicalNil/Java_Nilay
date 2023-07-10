package Easy;

import HW.TreeNode;

public class MinimumDepthBinaryTree_111 {
    public int minDepth(TreeNode root) {
    if (root == null)
      return 0;
    if (root.left == null)
      return minDepth(root.right) + 1;
    if (root.right == null)
      return minDepth(root.left) + 1;
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

}
