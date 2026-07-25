class Solution {
    public int maxProduct(int n) {
       
        int biggest=0;
        int bigger=0;

        while(n>0){
            int digit=n%10;

            if(digit > biggest){
                bigger = biggest;
                biggest = digit;
            }else if (digit > bigger){
                bigger = digit;
            }
             n /= 10;
        }

        return biggest * bigger;
    }
}