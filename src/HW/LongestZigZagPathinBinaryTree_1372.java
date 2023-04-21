package HW;

public class LongestZigZagPathinBinaryTree_1372 {
    class Solution {
    public int max=0;
    public void find(TreeNode root,int dir,int currLength){
        if(root==null) return;
        max=Math.max(max,currLength);
        if(dir==1){
            find(root.left,0,currLength+1);
            find(root.right,1,1);
        }
        else{
            find(root.right,1,currLength+1);
            find(root.left,0,1);
        }
    }

    public int longestZigZag(TreeNode root) {
        find(root,0,0);
        find(root,1,0);
        return max;
    }
}

    public static void main(String[] args) {
        LongestZigZagPathinBinaryTree_1372 lz = new LongestZigZagPathinBinaryTree_1372();
        Solution s = lz.new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(1);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        root.left.left.left.left = new TreeNode(1);
        root.left.left.left.right = new TreeNode(1);
        root.left.left.right.left = new TreeNode(1);
        root.left.left.right.right = new TreeNode(1);
        root.left.right.left.left = new TreeNode(1);
        root.left.right.left.right = new TreeNode(1);
        root.left.right.right.left = new TreeNode(1);
        root.left.right.right.right = new TreeNode(1);
        root.right.left.left.left = new TreeNode(1);
        root.right.left.left.right = new TreeNode(1);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(1);
        root.right.right.left.left = new TreeNode(1);
        root.right.right.left.right = new TreeNode(1);
        root.right.right.right.left = new TreeNode(1);
        root.right.right.right.right = new TreeNode(1);
        System.out.println(s.longestZigZag(root));
    }
}
