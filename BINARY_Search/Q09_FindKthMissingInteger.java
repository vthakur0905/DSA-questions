package A2_BinarySearch;

// ques link -> https://leetcode.com/problems/kth-missing-positive-number/description/

public class Q09_FindKthMissingInteger {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11} ;
        System.out.println(missingLinear(arr,5));
    }

    public static int missingLinear(int [] arr , int k){
        int m = 0;
        int arrMax = max(arr);

        for (int i = 0; i <= arrMax; i++) {
            if (!search(arr, i)) {

                if (m == k) {
                    return i;
                }
                m++;
            }
        }
        return -1;

    }
    public static int max(int [] arr){
        int max = 0 ;
        for (int i = 0; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean search(int [] arr , int f){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == f) {
                return true;
            } else if (arr[mid] > f) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
