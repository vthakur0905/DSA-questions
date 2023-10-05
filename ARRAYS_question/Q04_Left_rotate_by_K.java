package A1_Arrays;

import java.util.Arrays;

public class Q04_Left_rotate_by_K {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }

    static int [] rotate(int [] arr, int k){

        for (int i = 0 ; i < k ; i++ ){

            int temp = arr[0];
            for (int j = 1 ; j < arr.length ; j++){
                arr[j-1] = arr[j] ;
            }
            arr[arr.length-1] = temp;

        }

        return arr;
    }
}
