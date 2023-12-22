package A1_Arrays;

// link - https://leetcode.com/problems/two-sum/
// link - https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=SUBMISSION

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q15_2Sum {
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int target = 19;
        System.out.println(twoSum(arr,target)); // USING BRUTE FORCE
        System.out.println("-----------------");
        System.out.println(twoSum1(arr,target)); // BRUTE FORCE RETURNS INDEX AS WELL
        System.out.println("-----------------");
        System.out.println(twoSum1(arr,target)); // BETTER APPROACH USING HASHING RETURNS INDEX AS WELL
        System.out.println("-----------------");
        System.out.println(sumCheck(arr,target)); // OPTIMAL APPROACH
    }

    public static int[] twoSumHashing(int [] arr, int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static boolean twoSum(int [] arr , int target){

        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean sumCheck(int [] arr, int target){
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1 ;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            } else if (sum < target) {
                left++;
            }else{
                right--;
            }
        }
        return false;
    }

    //    below function will return index as well.
    public static ArrayList<Integer> twoSum1(int [] arr , int target){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }

        return ans;
    }
}
