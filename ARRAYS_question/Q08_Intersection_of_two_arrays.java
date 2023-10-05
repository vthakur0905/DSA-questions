package A1_Arrays;

// Ques link - https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;

public class Q08_Intersection_of_two_arrays {
    public static void main(String[] args) {

        int[] arr = {4,9,5};
        int[] arr1 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(arr, arr1)));

    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (i > 0){
                if (arr1[i] != arr1[i-1]){
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr1[i] == arr2[j]){
                            if (!list.contains(arr1[i])) {
                                list.add(arr1[i]);
                                break;
                            }
                        }

                    }
                }
            }
            else {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]){
                        if (!list.contains(arr1[i])) {
                            list.add(arr1[i]);
                        }
                    }
                }
            }
        }

        int[] ansArr = list.stream().mapToInt(Integer::intValue).toArray();

        return ansArr ;
    }

}
