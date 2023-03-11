package com.dfs;

import com.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inOrder(TreeNode node, List<Integer> arrayList) {
        if (node != null) {
            inOrder(node.left, arrayList);
            arrayList.add(node.val);
            inOrder(node.right, arrayList);
        }

        return arrayList;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);

        return result;
    }
}