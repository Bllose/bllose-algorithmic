package bllose.binaryTree;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import bllose.binaryTree.TreeHelper.TreeNode;

public class BreadthFirstSearchTest {

    @Test
    public void bfsTest(){
        TreeNode root = TreeHelper.establishBinaryTree(new Integer[]{5, 6, 4,null, null, 1, 8});
        Assert.assertEquals("[5,6,4,1,8]",
                JSONObject.toJSONString(TreeHelper.breadthFirstSearch(root)));
    }

    @Test
    public void covertTest(){
        TreeNode root = TreeHelper.establishBinaryTree(new Integer[]{5, 6, 4,null, null, 1, 8});
        Assert.assertEquals("[5,6,4,null,null,1,8]",
                JSONObject.toJSONString(TreeHelper.covertNode2Array(root)));
    }
}
