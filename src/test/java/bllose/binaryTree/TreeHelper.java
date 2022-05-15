package bllose.binaryTree;

import bllose.binaryTree.BinaryTrees.TreeNode;

public class TreeHelper {
    public static TreeNode establishBinaryTree(Integer[] values){
        if(values == null || values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        building(values, 2, root, true);
        building(values, 3, root, false);
        return root;
    }

    private static void building(Integer[] values, int position, TreeNode root, boolean isLeftChild){
        if(values.length<position || values[position-1] == null) return;
        TreeNode curNode = new TreeNode(values[position - 1]);
        if(isLeftChild){
            root.left = curNode;
        }else{
            root.right = curNode;
        }
        if(values.length >= position * 2) building(values, position*2, curNode, true);
        if(values.length >= position * 2 + 1) building(values, position*2+1, curNode, false);
    }
}
