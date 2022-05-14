package bllose.binaryTree;

import org.junit.Test;

import bllose.binaryTree.BinaryTrees.TreeNode;
import org.junit.Assert;

public class ValidBSTTest {

    BinaryTrees bt = new BinaryTrees();

    @Test
    public void testCase1(){
        TreeNode newRoot = establishBinaryTree(new Integer[]{2,1,3});

        Assert.assertEquals(true, bt.isValidBST(newRoot));
    }

    @Test
    public void testCase2(){
        TreeNode root = establishBinaryTree(new Integer[]{2,2,2});
        Assert.assertEquals(false, bt.isValidBST(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = establishBinaryTree(new Integer[]{1,null,1});
        Assert.assertEquals(false, bt.isValidBST(root));
    }

    @Test
    public void testCase4(){
        TreeNode root = establishBinaryTree(new Integer[]{5,4,6,null,null,3,7});
        Assert.assertEquals(false, bt.isValidBST(root));
    }

    @Test
    public void testCase5(){
        TreeNode root = establishBinaryTree(new Integer[]{32,26,47,19,null,null,56,null,27});
        Assert.assertEquals(false, bt.isValidBST(root));
    }

    private TreeNode establishBinaryTree(Integer[] values){
        if(values == null || values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        building(values, 2, root, true);
        building(values, 3, root, false);
        return root;
    }

    private void building(Integer[] values, int position, TreeNode root, boolean isLeftChild){
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
