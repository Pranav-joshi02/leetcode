class Solution {
    public int countCommas(int n) {
        int num=n;
        int count=0;
        while(num>0){
      
            num /=10;
            count++;
        }
        if(count<=3) return 0;


        return n - 999 ;
    }
}