package bllose.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTrees{

    public static class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;
        TreeNode(Integer val){this.val = val;}
        TreeNode(Integer val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root){
        if(null == root) return true;

        if(root.left != null){
            if(!valid(root.left, null, root.val)) return false;
        } 
        if(root.right != null){
            if(!valid(root.right, root.val, null)) return false;
        }

        return true;
    }
    private boolean valid(TreeNode root, Integer min, Integer max){
        if(max != null && root.val >= max) return false;
        if(min != null && root.val <= min) return false;

        if(root.left != null){
            if(!valid(root.left, min, root.val)) return false;
        }
        if(root.right != null){
            if(!valid(root.right, root.val, max)) return false;
        }
        return true;
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if(null == root) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rootLevel = new ArrayList<>();
        rootLevel.add(root.val);
        result.add(rootLevel);

        if(root.left != null) levelOrderTraversal(root.left, 2, result);
        if(root.right != null) levelOrderTraversal(root.right, 2, result);

        return result;
    }
    private void levelOrderTraversal(TreeNode root, int high, List<List<Integer>> result) {
        List<Integer> curLevel;
        if(result.size() >= high){
            curLevel = result.get(high - 1);
        }else{
            curLevel = new ArrayList<>();
            result.add(curLevel);
        }

        curLevel.add(root.val);

        if(root.left != null) levelOrderTraversal(root.left, high + 1, result);
        if(root.right != null) levelOrderTraversal(root.right, high + 1, result);
    }
}