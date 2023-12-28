package A1_Arrays;

import java.util.Arrays;

public class Q21_Rotate_Matrix_90 {
    public static void main(String[] args) {
        int [] [] arr = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        System.out.println(Arrays.deepToString(rotate(arr)));
    }

    public static int [][] rotate(int [][] arr){
        transpose(arr);
        revArr(arr);

        return arr;
    }
    public static int[][] transpose(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0 ; i < rows ; i++){
            for (int j = i+1 ; j < cols ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
        return arr ;
    }

    public static int[][] revArr(int [][] arr){
        int rows = arr.length ;
//        int col = arr[rows].length ;

        for (int i = 0 ; i < rows ; i++){
            int start = 0;
            int end = arr[i].length -1 ;
            while (start < end ){
                int temp  = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp ;

                start++ ;
                end -- ;
            }
        }
        return arr ;
    }
}
