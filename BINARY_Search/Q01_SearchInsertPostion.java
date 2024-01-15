package A2_BinarySearch;

//Ques link = https://leetcode.com/problems/search-insert-position/description/

public class Q01_SearchInsertPostion {
    public static void main(String[] args) {

    }

    // Approach 1 - just linear search the array and if find the element return the index, else return the index of the bigger element


//    approach 2
    public int searchInsert(int[] arr, int x) {
        int low = 0;
        int high = arr.length -1 ;
    int ans = arr.length;

    while (low <= high) {
        int mid = (low + high) / 2;
        // maybe an answer
        if (arr[mid] >= x) {
            ans = mid;
            //look for smaller index on the left
            high = mid - 1;
        } else {
            low = mid + 1; // look on the right
        }
    }
    return ans;
}
}
