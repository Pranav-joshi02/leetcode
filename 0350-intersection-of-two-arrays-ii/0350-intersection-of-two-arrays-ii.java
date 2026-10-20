class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[Math.min(nums2.length,nums1.length)];
        for(int i : nums2){
           map.put(i,map.getOrDefault(i,0)+1);
        }
        int idx=0;
        for(int num : nums1){
            if(map.getOrDefault(num,0)>0){
                result[idx++]=num;
                map.put(num,map.get(num)-1);
            }
        }
        return Arrays.copyOf(result, idx);
    }
}