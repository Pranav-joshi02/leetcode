class Solution {
    int dp[];
    int cost[];
    private int mincost(int i){
        if(i>=cost.length){return 0;}

        if(dp[i]!=-1){return dp[i];}

        return dp[i]= cost[i] + Math.min(mincost(i+1),mincost(i+2)); // paying for ith cost and then moving to 1 or 2 step further...
    }
    public int minCostClimbingStairs(int[] cost) {
        this.cost=cost;
        dp= new int[cost.length];
        Arrays.fill(dp,-1);

        return Math.min(mincost(0),mincost(1)); //either start from 0 or 1
    }
}