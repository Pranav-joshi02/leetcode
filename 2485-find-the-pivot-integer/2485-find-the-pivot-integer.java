class Solution {
    public int pivotInteger(int n) {
        int totalsum = (n*(n+1))/2;

        int leftsum=0;
        for( int i = 1 ; i <= n ; leftsum += i++){
            if(leftsum*2 == totalsum-i) return i;
        }

        return -1;
    }
}