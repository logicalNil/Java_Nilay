package HW;

import java.util.LinkedList;

public class MaxWidthofBinaryTree {
    public static void main(String[] args) {
        MaxWidthofBinaryTree mwb = new MaxWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
    }

}
