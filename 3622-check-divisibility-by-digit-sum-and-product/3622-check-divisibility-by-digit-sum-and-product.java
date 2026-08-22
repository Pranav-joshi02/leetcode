class Solution {
    public int checkSum(int num){
        int digit=0;
        while(num>0){
            digit+=num%10;
            num /= 10;
        }
        return digit;
    }
    public int checkPrd(int num){
        int digit=1;
        while(num>0){
            digit *=num%10;
            num /= 10;
        }
        return digit;
    }
    public boolean checkDivisibility(int n) {
        return (n % (checkSum(n) + checkPrd(n)) == 0 ) ? true : false;
    }
}