class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int diff[] = new int[n];
        int result[]= new int[n];
        for(int[] flightrange : bookings){
           int start = flightrange[0] - 1;
           int end = flightrange[1] -1;
           int seats = flightrange[2];

           diff[start] += seats;
           if(end + 1 < n) diff[end +1] -= seats;
        } 

        for(int i = 1 ; i < diff.length ; i++){
            diff[i] += diff[i-1];
        }
        return diff;
    }
}