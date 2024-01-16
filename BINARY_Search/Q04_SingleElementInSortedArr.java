package A2_BinarySearch;

// question link -> https://leetcode.com/problems/single-element-in-a-sorted-array/

public class Q04_SingleElementInSortedArr {
    public static void main(String[] args) {

    }
    public static int singleNonDuplicate(int[] arr) {

        if (arr.length == 1){
            return arr[0] ;
        }
        if (arr[arr.length-1] != arr[arr.length - 2]){
            return arr[arr.length-1] ;
        }
        if (arr[0] != arr[1]){
            return arr[0];
        }

        int low  = 0 ;
        int high = arr.length -1 ;

        while(low <= high ){
            int mid = low + (high-low)/2 ;

            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }

            else if ((mid % 2 == 0 && arr[mid] == arr[mid+1]) || (mid % 2 == 1 && arr[mid] == arr[mid-1]))
            {
                low = mid +1 ;
            }
            else {
                high  = mid - 1 ;
            }

        }

        return -1 ;


    }

}
