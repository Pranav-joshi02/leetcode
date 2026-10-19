class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
        while(n>0){
            sum = sum +(n%10);
            prd = prd*(n%10);
            n /= 10;
        }
        return (prd - sum);
    }
}