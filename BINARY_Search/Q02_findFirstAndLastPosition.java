package A2_BinarySearch;

// problem link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class Q02_findFirstAndLastPosition {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,8,8,10};
        System.out.println(Arrays.toString(OptimalPositon(arr, 8)));
    }


//    APPROACH 1 - run a linear search when you find the element first time push it to the ans arr and then push the last index.
    public static int[] position(int [] arr, int target){
        int [] ans = {-1,-1} ;

        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == target){
                ans[0] = i ;
                break ;
            }
        }
        for (int i = arr.length - 1; i > 0 ; i--){
            if (arr[i] == target){
                ans[1] = i ;
                break ;
            }
        }
        return ans;
    }

    //    APPROACH 2 - using binary search, run two binary for first and for last occurrence.
    public static int[] OptimalPositon(int [] arr, int target){
        int first = -1; // for answers
        int  low = 0, high = arr.length - 1 ; // for binary search

        // first occurence
        while (low <= high){
            int mid = low + (high - low)/2 ;

            if (arr[mid] == target){
                first = mid ;
                high = mid - 1 ;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else{
                high = mid - 1 ;
            }
        }
        // last occurrence
        int last = -1;
        low = 0;
        high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2 ;

            if (arr[mid] == target){
                last = mid ;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else{
                high = mid - 1 ;
            }
        }

        return new int[]{first, last};

    }

}

