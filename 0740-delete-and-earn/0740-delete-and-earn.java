class Solution {
    int[] points;
    int[] dp;

    private int solve(int i) {
        if (i >= points.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Option 1: Take current number
        int take = points[i] + solve(i + 2);

        // Option 2: Skip current number
        int skip = solve(i + 1);

        return dp[i] = Math.max(take, skip);
    }

    public int deleteAndEarn(int[] nums) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        points = new int[max + 1];

        // points[i] = total points from all occurrences of i
        for (int num : nums) {
            points[num] += num;
        }

        dp = new int[max + 1];
        Arrays.fill(dp, -1);

        return solve(0);
    }
}