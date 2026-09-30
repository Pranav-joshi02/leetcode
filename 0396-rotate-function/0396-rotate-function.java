class Solution {
    public int maxRotateFunction(int[] nums) {
        // int ans = Integer.MIN_VALUE;
        // int shift=0;
        // while(shift != nums.length){
        // int sum=0;

        //     int temp = nums[0];
        //     for( int i =1 ; i < nums.length; i++){
        //         sum = sum + (nums[i] * i );

        //         nums[i -1] = nums[i];
        //     }
        //     nums[nums.length -1] = temp;
        //     ans = Math.max(sum , ans);
        //     shift++;
        // }
        // return ans;
        int sum=0;
        long finalans=0;

        for(int i =0; i < nums.length ; i++){
        sum += nums[i];
        finalans += (long)(nums[i] * i);
        }

        long ans=finalans;

        for(int k=1 ; k<nums.length ; k++){
            finalans = finalans + sum - (long)nums.length * nums[nums.length - k];
            ans=Math.max(ans,finalans);
        }
        return (int)ans;
    }
}