class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int count=0;
        while(temp>0){
            temp /= 10;
            count++;
        }
        int[] arr = new int[count+1];
        int i=0;
        while(n>0){
            arr[i]=n%10;
            n /= 10;
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1] * arr[arr.length-2];
    }
}