package bllose.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class TreeHelper {  

    /**
     * 二叉树结点
     */
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

    /**
     * 二叉树节点转化为二叉数组先序序列
     * 
     * @param root
     * @return
     */
    public static Integer[] preOrderTraversal(TreeNode root){
        int depth = traveralingTheDeep(root, 1);
        Integer[] treeArray = new Integer[(int) Math.pow(2.0, depth)];
        addNodeToArray(root, treeArray, 1);
        return treeArray;
    }
    private static void addNodeToArray(TreeNode root, Integer[] treeArray, int i) {
        if(root == null) return;
        treeArray[i-1] = root.val;
        if(i * 2 < treeArray.length) addNodeToArray(root.left, treeArray, i * 2);
        if(i * 2 + 1 < treeArray.length) addNodeToArray(root.right, treeArray, i * 2 + 1);
    }

    /**
     * 遍历二叉树深度
     * 
     * @param root
     * @param i 当前层级，root层为 1
     * @return 最大深度
     */
    public static int traveralingTheDeep(TreeNode root, int i) {
        int left = 0;
        int right = 0;
        if(root.left!=null)  left = traveralingTheDeep(root.left, i + 1);
        if(root.right!=null) right = traveralingTheDeep(root.right, i + 1);
        if(left > i) i = left; 
        if(right > i) i = right;
        return i;
    }

    /**
     * 中序遍历搜索二叉树
     * 
     * @param root
     * @return 有序队列，无null
     */
    public static List<Integer> inOrderTraversalBST(TreeNode root) {
        if(null == root) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        if(root.left != null){
            result.addAll(inOrderTraversalBST(root.left));
        }
        result.add(root.val);
        if(root.right != null){
            result.addAll(inOrderTraversalBST(root.right));
        }
        return result;
    }

    

    /**
     * 将数组转化为二叉树
     *
     * 该二叉树顺序严格遵照数组顺序
     *
     * @param values
     * @return
     */
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
