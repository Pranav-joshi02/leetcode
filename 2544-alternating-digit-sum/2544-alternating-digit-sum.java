class Solution {
    private int countDigits(int num){
        if(num==0) return 1;
        return (int) Math.log10(Math.abs(num))+1;
    }
    public int alternateDigitSum(int n) {
        int sum=0;
        
           
             boolean pos=(countDigits(n)%2==0) ? true : false;
            while(n>0){

                if(pos){
                    sum = sum - (n%10);
                    n /=10;
                    pos=!pos;
                }
                else{
                    sum = sum + (n%10);
                    n /=10;
                    pos=!pos;
                }
            }
        return sum;
    }
}