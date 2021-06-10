package com.company;
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int result = 0, i;
        LinkedList<TreeNode> nd = new LinkedList<TreeNode>();
        nd.add(root);
        while (!nd.isEmpty()) { for (i = nd.size() - 1, result = 0; i >= 0; --i) {
                TreeNode node = nd.poll();
                result += node.val;
                if (node.right != null) nd.add(node.right);
                if (node.left  != null) nd.add(node.left); } }
        return result;
    }}

