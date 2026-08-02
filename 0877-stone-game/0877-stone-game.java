class Solution {


    int[][] dp;

    int check(int[] piles, int left, int right) {
        if (left == right) {
            return piles[left];
        }

        if (dp[left][right] != Integer.MIN_VALUE) {
            return dp[left][right];
        }

        int pickLeft = piles[left] - check(piles, left + 1, right);
        int pickRight = piles[right] - check(piles, left, right - 1);

        return dp[left][right] = Math.max(pickLeft, pickRight);
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        return check(piles, 0, n - 1) >= 0;
    }
}
    
