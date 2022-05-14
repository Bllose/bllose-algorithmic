package bllose.binaryTree;

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
}