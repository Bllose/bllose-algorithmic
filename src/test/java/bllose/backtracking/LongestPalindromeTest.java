package bllose.backtracking;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest{
    LongestPalindrome lp = new LongestPalindrome();

    @Test
    public void bruteForce1(){
        Assert.assertEquals("bab", lp.bruteForce("babad"));    
    }

    @Test
    public void bruteForce2(){
        Assert.assertEquals("a", lp.bruteForce("a"));    
    }

    @Test
    public void bruteForce3(){
        Assert.assertEquals("bb", lp.bruteForce("cbbd"));    
    }

    @Test
    public void dynamicProgramming1(){
        Assert.assertEquals("bab", lp.dynamicProgramming("babad"));    
    }

    @Test
    public void dynamicProgramming2(){
        Assert.assertEquals("a", lp.dynamicProgramming("a"));    
    }

    @Test
    public void dynamicProgramming3(){
        Assert.assertEquals("bb", lp.dynamicProgramming("cbbd"));    
    }

    @Test
    public void dynamicProgramming4(){
        Assert.assertEquals("a", lp.dynamicProgramming("ac"));    
    }

    @Test
    public void dynamicProgramming5(){
        Assert.assertEquals("aca", lp.dynamicProgramming("aacabdkacaa"));    
    }

    @Test
    public void dynamicProgramming6(){
        Assert.assertEquals("aaaa", lp.dynamicProgramming("aaaa"));    
    }
}