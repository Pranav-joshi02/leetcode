class Solution {
    public long sumAndMultiply(int n) {
        Deque<Long> deque = new LinkedList<>();

        long sum=0;
        while(n>0){
            sum += n%10;
            long t=n%10;
            deque.addLast(t);
            n /= 10;
        }

        long num=0;
        while(!deque.isEmpty()){
            long tem=deque.pollLast();
            if(tem!=0){
                num = num*10+ tem;
            }
        }

        return num*sum;

    }
}