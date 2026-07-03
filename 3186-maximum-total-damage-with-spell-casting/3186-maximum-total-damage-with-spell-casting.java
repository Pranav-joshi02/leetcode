class Solution {

    List<Integer> values;
    List<Long> damage;
    long[] dp;

    private long solve(int i) {
        if (i >= values.size()) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // First index whose value is > values[i] + 2
        int next = upperBound(values.get(i) + 2);

        long take = damage.get(i) + solve(next);
        long skip = solve(i + 1);

        return dp[i] = Math.max(take, skip);
    }

    // Binary Search
    private int upperBound(int target) {
        int low = 0;
        int high = values.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (values.get(mid) <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public long maximumTotalDamage(int[] power) {

        TreeMap<Integer, Long> map = new TreeMap<>();

        for (int p : power) {
            map.put(p, map.getOrDefault(p, 0L) + p);
        }

        values = new ArrayList<>();
        damage = new ArrayList<>();

        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            values.add(entry.getKey());
            damage.add(entry.getValue());
        }

        dp = new long[values.size()];
        Arrays.fill(dp, -1);

        return solve(0);
    }
}