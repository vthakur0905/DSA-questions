package A1_Arrays;
// in this we just reverse the array to get the answer

import java.util.Arrays;

public class Q04_Left_rotate_by_K_optimalSolution {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(arr, 2, 6)));
    }

    public static int [] rotate(int [] arr , int d, int n){
        reverse(arr, 0, n-d-1);
        reverse(arr,n-d,n-1 );
        reverse(arr, 0, n-1);

        return arr;
    }

    public static int[] reverse(int [] arr , int start , int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
