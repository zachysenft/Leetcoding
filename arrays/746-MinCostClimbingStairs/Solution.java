class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];

        int i = cost.length-1;

        dp[i] = cost[i];
        dp[i-1] = cost[i-1];
        i -= 2;

        while(i >= 0) {
            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
            i--;
        }
        return Math.min(dp[0],dp[1]);
    }
}