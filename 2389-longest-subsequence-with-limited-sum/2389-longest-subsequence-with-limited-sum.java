class Solution {
    private int search(int low , int high , int target , int[] arr){
        if (low > high) {
            return high;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] <= target) {
            return search(mid + 1, high, target, arr);
        }
        return search(low, mid - 1, target, arr);
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int prefix[] = new int[nums.length+1];
        Arrays.sort(nums);
        for(int i =1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        for(int q=0 ; q < queries.length ; q++){
            queries[q]=search(0,prefix.length-1,queries[q],prefix);
        }
        return queries;
    }
}