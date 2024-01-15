package A2_BinarySearch;

import java.util.Arrays;

public class Q03_SearchInRotatedArr {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(BinarySearch(arr, 4));
    }

    // APPROACH 1 - optimal - run a binary search and check each time if it sorted or not.
    public static int BinarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length -1 ;

        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] == target){
                return mid ;
            }

            // if left is sort
            if (arr[low] <= arr[mid]){
                if (arr[low] <= target && arr[mid] >= target ){
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1;
                }
            }
            else {
                if (arr[mid] <= target && arr[high] >= target ){
                    low = mid + 1;
                }
                else{
                    high = mid - 1 ;
                }
            }
        }
        return -1;
    }
}
