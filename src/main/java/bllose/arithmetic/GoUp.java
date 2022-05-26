package bllose.arithmetic;

import java.util.Arrays;

public class GoUp {
    
    /**
     * 暴力破解， O(n * 2^n)
     * 
     * @param nums
     * @param begin
     * @return
     */
    private static int bruteForce(int[] nums, int begin){
        if(begin == nums.length - 1) return 1;

        int maxLen = 1;
        for(int curIndex = begin + 1; curIndex < nums.length; curIndex ++){
            if(nums[curIndex] > nums[begin]) {
                maxLen = Math.max(maxLen, bruteForce(nums, curIndex) + 1) ;
            }
        }
        return maxLen;
    }
    public static int longestSubArray(int[] nums){
        int longest = 0;
        for( int i = 0; i <  nums.length; i ++){
            longest = Math.max(longest, bruteForce(nums, i));
        }
        return longest;
    }


    /**
     * 
     * @param nums
     * @param begin
     * @param memo
     * @return
     */
    private static int memory(int[] nums, int begin, int[] memo){
        if(memo[begin] != 0) return memo[begin];

        if(begin == nums.length - 1) return 1;

        int maxLen = 1;
        for(int curIndex = begin + 1; curIndex < nums.length; curIndex ++){
            if(nums[curIndex] > nums[begin]) {
                maxLen = Math.max(maxLen, memory(nums, curIndex, memo) + 1) ;
            }
        }

        memo[begin] = maxLen;
        return maxLen;
    }
    public static int longestSubArrayByMemo(int[] nums){
        int longest = 0;
        int[] memo = new int[nums.length];
        for( int i = 0; i <  nums.length; i ++){
            longest = Math.max(longest, memory(nums, i, memo));
        }
        return longest;
    }


    /**
     * 动态规划，非递归，迭代
     * 
     * @param nums
     * @return
     */
    public static int Nonrecursive(int[] nums){
        int[] recorder = new int[nums.length];
        Arrays.fill(recorder, 1);

        for(int begin = nums.length - 1; begin >= 0; begin --){
            for(int curIndex = begin; curIndex < nums.length; curIndex ++){
                if(nums[curIndex] > nums[begin]){
                    recorder[begin] = Math.max(recorder[begin], recorder[curIndex] + 1);
                }
            }
        }

        return Arrays.stream(recorder).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{1,5,2,4,3}));
        System.out.println(longestSubArrayByMemo(new int[]{1,5,2,4,3}));
        System.out.println(Nonrecursive(new int[]{1,5,2,4,3}));
    }

}
