class Solution {
   

    int[][] dp;

    int check(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        if (dp[left][right] != Integer.MIN_VALUE) {
            return dp[left][right];
        }

        int pickLeft = nums[left] - check(nums, left + 1, right);
        int pickRight = nums[right] - check(nums, left, right - 1);

        return dp[left][right] = Math.max(pickLeft, pickRight);
    }

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return check(nums, 0, n - 1) >= 0;
    }
}
