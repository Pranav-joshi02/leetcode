class Solution {

    int[] dp;

    int solve(int[] stoneValue, int i) {
        if (i >= stoneValue.length) {
            return 0;
        }

        if (dp[i] != Integer.MIN_VALUE) {
            return dp[i];
        }

        int sum = 0;
        int ans = Integer.MIN_VALUE;

        // Take 1, 2, or 3 stones
        for (int k = 0; k < 3 && i + k < stoneValue.length; k++) {
            sum += stoneValue[i + k];
            ans = Math.max(ans, sum - solve(stoneValue, i + k + 1));
        }

        return dp[i] = ans;
    }

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        int diff = solve(stoneValue, 0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }
}