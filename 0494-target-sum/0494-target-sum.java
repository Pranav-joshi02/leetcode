class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        // dp[sum][index] = number of ways to make target from current sum at index i
        this.nums=nums;
         dp = new int[nums.length][2001];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return check( sum, target, 0 );
    }
    int nums[];
    int dp[][];
    public int check( int sum, int target, int i){
        if(i == nums.length){
            return sum == target ? 1 : 0; 
        }

        if(dp[i][sum+1000] != -1) return dp[i][sum+1000];

        int add = check( sum + nums[i], target, i+1);
        int sub = check( sum - nums[i], target, i+1);

        return dp[i][sum+1000] = add + sub;
        
    }
}