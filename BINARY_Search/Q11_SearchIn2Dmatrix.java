package A2_BinarySearch;

// Ques link -> https://leetcode.com/problems/search-a-2d-matrix/description/

public class Q11_SearchIn2Dmatrix {

    public static void main(String[] args) {
        int [][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        } ;

        System.out.println(search(arr, 16));
    }

//     Approach - Using binarysearch , first check that the element is present in that particular row or not by comparing last and first element of that particular row if element is present that apply binarysearch
    public static boolean search(int [][] arr, int target){

        for (int i = 0; i < arr.length ; i++){
            if (target > arr[i][0] && target <= arr[i][arr[i].length-1]){
                int low = 0 ;
                int high = arr[i].length - 1;

                while (low <= high){
                    int mid = low + (high-low)/2 ;

                    if (arr[i][mid] == target){
                        return true ;
                    }
                    else if (arr[i][mid] < target) {
                        low = mid + 1;
                    }
                    else {

                        high = mid - 1;
                    }
                }
            }
        }
        return false ;
    }
}
