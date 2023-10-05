package A1_Arrays;

// Ques - https://leetcode.com/problems/rotate-array/description/

import java.util.Arrays;

public class Q05_Right_rotate_by_K {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }

    static int [] rotate(int [] arr, int k){

        int l = arr.length;

        for (int i = 0 ; i < k ; i++ ){

            int temp = arr[l-1];
            for (int j = l-2 ; j >= 0 ; j--){
                arr[j+1] = arr[j] ;
            }
            arr[0] = temp;

        }
        return arr;
    }

}
