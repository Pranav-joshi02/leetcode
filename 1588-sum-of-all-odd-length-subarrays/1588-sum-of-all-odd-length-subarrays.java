class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count=1;
        int sum=0;
        int previous=0;
        for( int i = 0 ; i < arr.length ; i++){
            count=1;
            previous=0;
            for(int j = i ; j < arr.length ; j++){
                previous += arr[j];
                if(count%2!=0) sum += previous;
                count++;
            }
        }
        return sum;
    }
}