package HW;

public class BinaryTreefromInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = buildTree(inorder, inStart, index - 1, postorder, postStart, postStart + index - inStart - 1);
        root.right = buildTree(inorder, index + 1, inEnd, postorder, postStart + index - inStart, postEnd - 1);
        return root;
    }

    public void main(String[] args) {
        BinaryTreefromInorderPostorder binaryTreefromInorderPostorder = new BinaryTreefromInorderPostorder();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = binaryTreefromInorderPostorder.buildTree(inorder, postorder);
        System.out.println("The root of the tree is " + root.val);
    }
}
