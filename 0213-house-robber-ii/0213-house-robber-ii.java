class Solution {
    int dp[];
    int nums[];
    private int yeaa(int i, int end){
        if(i> end){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
         int rob = nums[i] +yeaa(i+2,end);
         int cant=yeaa(i+1,end);

        return dp[i]=Math.max(cant,rob);

    }
     
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        this.nums=nums;
        //from first to last but one 
        dp= new int[nums.length];
        Arrays.fill(dp,-1);
        int case1=yeaa(0,nums.length-2);
        //from second to last
        
        Arrays.fill(dp,-1);
        int case2=yeaa(1,nums.length-1);
        return Math.max(case1,case2);
    }
}