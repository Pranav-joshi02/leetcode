class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[2051];
        int max=0;
        int result=0;
        for( int[] log : logs){
            int start=log[0];
            int end =log[1];

            diff[start]++;
            diff[end]--;
        }

        for(int i=1950 ; i<=2050 ; i++){
            diff[i] += diff[i-1];
            if(diff[i] > max){
                result=i;
                max=diff[i];
            }
        }
        return result;
    }
}