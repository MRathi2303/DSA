class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findMax(piles);
        while(left<right){
            int mid = left + (right-left)/2;
            if(timeTaken(piles,mid)<=h){
                right=mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    //function to find the time taken to eat all bananas
    int timeTaken(int [] arr,int m){
        int hours = 0;
        for (int pile : arr) {
            hours += (pile + m - 1) / m; 
        }
        return hours;
    }

    public static int findMax(int[] array) {
        
        int max = array[0];

        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }

        return max; 
    }
}