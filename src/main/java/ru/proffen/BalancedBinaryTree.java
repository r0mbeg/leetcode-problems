package ru.proffen;

public class BalancedBinaryTree {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftHeight = treeDepth(root.left);
        int rightHeight = treeDepth(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int treeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);
        TreeNode root8 = new TreeNode(8);


        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root4.left = root8;

        System.out.println(isBalanced(root1));





    }

}
