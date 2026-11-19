class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];

        for( int[] range : ranges){
            
            diff[range[0]]++;
            diff[range[1]+1]--;
        }
        int cover=0;
        for(int i=0 ; i < diff.length ; i++){
            cover += diff[i];
            if(i >= left && i <= right &&  cover == 0 ) return false;
        }

        

        return true;
    }
}