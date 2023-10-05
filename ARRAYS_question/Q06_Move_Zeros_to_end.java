package A1_Arrays;

// Ques - https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.Arrays;

public class Q06_Move_Zeros_to_end {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,2,3};
        System.out.println(Arrays.toString(moveZeros(6,arr)));
    }
    public static int[] moveZeros(int n, int []arr) {

        int [] temp = new int [n];

        for (int i = 0, j =0; i < temp.length ; i++){
            if (arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }
}
