class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for( int start=1 ; start<10 ; start++){
            int num=0;
            for(int digit=start; digit<10 ; digit++){
                num = num*10 + digit;

                if(num >= low && num <= high){
                list.add(num);
            }
            }
            
        }
        Collections.sort(list);
        return list;
    }
}