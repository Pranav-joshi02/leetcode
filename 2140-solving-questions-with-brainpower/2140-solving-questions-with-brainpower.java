class Solution {
    long dp[];
    int questions[][];
    private long check(int i ){
        if(i>=dp.length) return 0;
        if(dp[i]!=-1){
             return dp[i];}

        int points=questions[i][0];
        int power=questions[i][1];

        long take= points + check( i + power +1);
    
        long skip=check( i +1 );
       
        return dp[i]=Math.max(take,skip);
    }
    public long mostPoints(int[][] questions) {
        this.questions=questions;
        dp= new long[questions.length ];
        Arrays.fill(dp,-1);
        return check(0);
    }
}