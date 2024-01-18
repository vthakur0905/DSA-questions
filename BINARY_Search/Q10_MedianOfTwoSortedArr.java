package A2_BinarySearch;

// ques link -> https://leetcode.com/problems/median-of-two-sorted-arrays/description/

import java.util.Arrays;

public class Q10_MedianOfTwoSortedArr {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totallength = nums1.length + nums2.length ;
        int [] newarr = new int[totallength] ;

        int j = 0 ;
        for (int i = 0; i < nums1.length; i++){
            newarr[j] = nums1[i];
            j++;
        }
        for (int i = 0; i < nums2.length; i++){
            newarr[j] = nums2[i];
            j++;
        }
        Arrays.sort(newarr);

        if (totallength % 2 == 0){
            int temp = (totallength-1)/2;
            return ((double) (newarr[temp + 1] + newarr[temp]) /2) ;
        }
        else{
            return newarr[(totallength-1)/2];
        }
    }
}
