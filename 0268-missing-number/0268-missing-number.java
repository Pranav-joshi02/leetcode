class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int min : nums){
            sum+=min;
        }
        return (((nums.length)*(nums.length+1)/2)-sum);
    }
}