class Solution {
    int[] nums;
    HashMap<String, Integer> dp;

    private int sum(int i, int target) {

        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }

        String key = i + "," + target;

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int pos = sum(i + 1, target - nums[i]);
        int neg = sum(i + 1, target + nums[i]);

        int ans = pos + neg;

        dp.put(key, ans);

        return ans;
    }

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        dp = new HashMap<>();

        return sum(0, target);
    }
}