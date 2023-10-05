package A1_Arrays;

// Ques link = https://leetcode.com/problems/sort-colors/description/

//approach - use national dutch algorithm -use 2 pointers, if mid = 0 , swap mid and low, mid = 2, swap mid and high, mid =1 just mid++,, only works for 3 types of elements.

import java.util.Arrays;

public class Q09_Sort_colors {
    public static void main(String[] args) {
        int [] arr =  {2,1,2,0,0,2,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] arr) {

        int low = 0 ;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high){

            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                mid++;
                low++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
    }
}
