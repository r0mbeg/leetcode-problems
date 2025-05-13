package ru.proffen;

public class DiameterOfABinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }


    public int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        treeDepth(root);
        return diameter;
    }

    public int treeDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        diameter = Math.max(diameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }



}
