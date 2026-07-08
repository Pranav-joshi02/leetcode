class Solution {
    int dp[];
    private int check(int sum){
        if(sum==0){return 0;}
        if(sum<0){return Integer.MAX_VALUE;}
        if(dp[sum]!=-1){return dp[sum];}
        int ans= 100000; //contraints upto 10^4
        for(int i=1;i*i<=sum;i++){
            int result=check(sum-i*i);

            if(result != 100000){
                ans=Math.min(ans,result+1);
            }
        }
        dp[sum]=ans;
        return ans;
    }
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        return check(n);
        }
}

        