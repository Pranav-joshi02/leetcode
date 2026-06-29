class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int task : tasks){
            map.put(task, map.getOrDefault(task,0)+1);
        }
       

        for(int freq : map.values()){
            if(freq == 1){return -1;}
            count += (freq+2)/3;
        }
       
        return count;

    }
}