class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[nums.length+1];

        for(int num : nums){
            freq[num]++;
        }

        for(int count=1 ; count< freq.length; count++){
            if(freq[count]>1) list.add(count);
        }
        return list;
    }
}