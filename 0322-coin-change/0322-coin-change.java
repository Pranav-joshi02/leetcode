class Solution {
    int dp[];
    int coins[];
   private int check(int amount) {

    if (amount == 0)
        return 0;

    if (amount < 0)
        return Integer.MAX_VALUE;

    if (dp[amount] != -1)
        return dp[amount];

    int ans = Integer.MAX_VALUE;

    for (int coin : coins) {

        int res = check(amount - coin);

        if (res != Integer.MAX_VALUE) {
            ans = Math.min(ans, 1 + res);
        }
    }

    dp[amount] = ans;
    return ans;
}
    public int coinChange(int[] coins, int amount) {
    
        this.coins=coins;
        dp= new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=check(amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}