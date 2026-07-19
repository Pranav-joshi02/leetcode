class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=0;
        for( int num : candies ){
            max=Math.max(num,max);
        }
        for( int candie : candies ){
            candie += extraCandies;
            if (max <= candie){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}