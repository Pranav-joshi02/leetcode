class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Set.of('A','E','I','O','U','a','e','i','o','u'));
        char chara[]= s.toCharArray();

        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !set.contains(chara[left])){
                left++;
            }
            while(left<right && !set.contains(chara[right])){
                right--;
            }
            char temp=chara[left];
            chara[left]=chara[right];
            chara[right] = temp;
            left++;
            right--;
        }
        return new String(chara);
    }
}