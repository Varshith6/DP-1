//Correct Solution with DP
// Time Complexity : O(2^n), We choose or dont choose the house to rob
// Space Complexity : O(2*n) = O(n) = Length of DP Matrix
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for(int i = 1; i<nums.length; i++){
            //no choose
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            //choose
            dp[i][1] = dp[i-1][0] + nums[i];
        }
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }
}