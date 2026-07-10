class Solution {
    int dp[];
    int days[];
    int costs[];
    private int check(int i){
        if(i>=days.length){return 0;}
        if(dp[i]!=-1){return dp[i];}
        int one=costs[0] + check(i+1);

        int j= i;
        while(j<days.length && days[j]<days[i]+7){
            j++;
            
        }
        int seven= costs[1] + check(j);

        j=i;
        while(j<days.length && days[j]<days[i]+30){
            j++;
            
        }
        int thirty= costs[2] + check(j);

        return dp[i]=Math.min(one,Math.min(seven,thirty));
        
    }
    public int mincostTickets(int[] days, int[] costs) {
        this.days=days;
        this.costs=costs;
        dp= new int[days.length];
        Arrays.fill(dp,-1);
        return check(0);
        
    }
}