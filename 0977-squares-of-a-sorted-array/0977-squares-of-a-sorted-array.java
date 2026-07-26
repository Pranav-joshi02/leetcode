class Solution {
    public int[] sortedSquares(int[] nums) {
        for( int i =0 ; i<nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        int left=0;
        int right=nums.length-1;
        int ans[] = new int[nums.length];
        int ansindex=ans.length-1;
        while(left <= right){
            if(nums[left] < nums[right]){
                ans[ansindex] = nums[right];
                right--;
                ansindex--;
            }
            else{
                ans[ansindex] = nums[left];
                left++;
                ansindex--;
            }
        }
        return ans;
    }
}