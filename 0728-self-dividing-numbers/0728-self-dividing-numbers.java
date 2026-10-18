class Solution {
    private int checkdigit(int num){
        if(num == 0) return 1 ;
        return (int)Math.log10(Math.abs(num))+1;
    }
    private boolean check(int num){
        int count=0;
        int checknum=checkdigit(num);
        int original=num;
        while(num>0){
            int digit= num % 10;
            if(digit>0){
                if(original % digit == 0) count++;
            }
            
            num /=10;
        }
        return (count==checknum) ? true : false;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i =left ; i<= right ; i++){
            if(check(i)) list.add(i);
        }

        return list;
    }
}