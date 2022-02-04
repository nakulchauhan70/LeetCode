package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);

        return result;
    }

    public static List<Integer> inOrder(TreeNode node, List<Integer> arrayList) {
        if (node != null) {
            inOrder(node.left, arrayList);
            arrayList.add(node.val);
            inOrder(node.right, arrayList);
        }

        return arrayList;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}