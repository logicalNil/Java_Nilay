package HW;


import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessofBinaryTree_958 {
    public boolean isCompleteTree(TreeNode root) {
    if (root == null) {
        return true;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean foundNull = false;
    while (!queue.isEmpty()) {
        TreeNode curr = queue.poll();
        if (curr == null) {
            foundNull = true;
        } else {
            if (foundNull) {
                return false;
            }
            queue.offer(curr.left);
            queue.offer(curr.right);
        }
    }
    return true;
}

        public void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            CheckCompletenessofBinaryTree_958 checkCompletenessofBinaryTree_958 = new CheckCompletenessofBinaryTree_958();
            boolean isComplete = checkCompletenessofBinaryTree_958.isCompleteTree(root);
            System.out.println("The tree is complete: " + isComplete);
        }
}
