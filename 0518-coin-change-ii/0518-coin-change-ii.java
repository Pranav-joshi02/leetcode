class Solution {
    int dp[][];
    int coins[];
    private int sum( int i , int amount ){
        if(amount<0) return 0;
        if(amount==0) return 1;
        if(i>=coins.length) return 0;

        if(dp[i][amount]!=-1) return dp[i][amount];

        int take=sum(i , amount - coins[i]) ;
        int skip=sum(i+1,amount);

        return dp[i][amount] = take + skip;
    }

    public int change(int amount, int[] coins) {
        this.coins=coins;
        dp= new int [coins.length][amount +1];
        for(int[] row : dp){
        Arrays.fill(row,-1);}
        return sum(0 , amount );
    }
}