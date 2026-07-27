class Solution {
    int candys[];
    private int candies( int rating[]){
        for( int i=1 ; i< rating.length; i++){
            if(rating[i] > rating[i-1]){
                candys[i] = candys[i-1] +1;
            }
        }

        for( int i=rating.length-2 ; i>=0 ; i--){
            if(rating[i] > rating[i+1]){
                candys[i] = Math.max(candys[i],candys[i+1] +1);
            }
        }
        int sum=0;
        for( int num : candys){
            sum += num;
        }

        return sum;
    }
    public int candy(int[] ratings) {
        candys = new int[ratings.length];
        Arrays.fill(candys,1);

        return candies(ratings);
    }
}