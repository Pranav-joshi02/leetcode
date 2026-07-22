class Solution {
    
    public int firstMissingPositive(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int count =0;
        for(int num : nums){
            if(num<0) continue;
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(num,max);
            count++;
        }
        
        for(int i =1;i<max;i++){
            if(!map.containsKey(i)) return i;
            
        }

        return count==0 ? 1 : max+1;
    }
}