package A2_BinarySearch;

import java.util.Arrays;

public class Q06_KokoEatingBanana {
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        System.out.println(binary(arr,8));
    }
    public static int calculateHours(int [] arr, int k){
        int hour = 0;
        for (int i = 0 ; i < arr.length ; i++){
            hour = (int) (hour + Math.ceil((double)(arr[i]) / (double)(k)));
        }

        return hour ;
    }

    public static int max (int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int binary(int [] arr, int h){

        int ans = 0 ;
        int low  =0;
        int high = max(arr);

        while (low <= high){
            int mid = low + (high - low)/2 ;
            int temp = calculateHours(arr,mid);

            if (temp <= h){
                high = mid -1 ;
            }
            else{
                low = mid - 1;
            }
        }
        return low;



    }
}
