class Solution {
    public long sumAndMultiply(int n) {
        // Deque<Long> deque = new LinkedList<>();

        // long sum=0;
        // while(n>0){
        //     sum += n%10;
        //     long t=n%10;
        //     deque.addLast(t);
        //     n /= 10;
        // }

        // long num=0;
        // while(!deque.isEmpty()){
        //     long tem=deque.pollLast();
        //     if(tem!=0){
        //         num = num*10+ tem;
        //     }
        // }

        // return num*sum;


         long num=0;
        long sum=0;
        long ans=0;
        while(n>0){
            if(n%10!=0){
                num=num*10+n%10;
                sum+=n%10;
                
            }n/=10;
        }
         while(num!=0){
            ans=ans*10+num%10;
            num/=10;
        }
        return ans*sum;
    }



   
}