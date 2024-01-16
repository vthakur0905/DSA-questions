package A2_BinarySearch;

// question link -> https://leetcode.com/problems/find-peak-element/description/

public class Q05_PeakElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(peak1(arr));
    }

//    Optimal Approach 1 - only one peak.
    public static int peak1(int [] arr){
        if (arr.length == 1){
            return 0;
        }
        if (arr.length == 2){
            if (arr[0] > arr[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        int ans = 0;
        int low = 0 ;
        int high = arr.length - 1;

        while (low <= high ){
            int mid = low + (high - low)/2 ;

            if (mid == 0){
                if (arr[mid] > arr[mid+1]){
                    return mid ;
                }
            }
            if (mid == arr.length - 1){
                if (arr[mid] > arr[mid-1]){
                    return mid ;
                }
            }

            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid ;
            }
            else if (arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
