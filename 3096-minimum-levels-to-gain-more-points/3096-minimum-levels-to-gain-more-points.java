class Solution {
    public int minimumLevels(int[] possible) {
        int alice=0;
        int sum=0;
        for(int i : possible){
            sum += (i==1)? 1:-1;
        }
        

        for(int i =0;i<possible.length-1;i++){
             int value = (possible[i] == 1) ? 1 : -1;
            alice += value;
            sum -= value;
            if(alice>sum){return i+1;}
            
        }
        return -1;
    }
}