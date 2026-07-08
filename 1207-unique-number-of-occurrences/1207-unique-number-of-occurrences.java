class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freqnum : map.values()){
            freq.put(freqnum,freq.getOrDefault(freqnum,0)+1);
            if(freq.get(freqnum)>1){return false;}
        }
        return true;
    }
}