package A1_Arrays;

import java.util.Arrays;

public class Q02_Remove_Duplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,3,3,4,5,5};
        System.out.println(Arrays.toString(remove(arr)));
    }

    public static int [] remove(int [] arr){

        int i = 0;
        for (int j = 0; j < arr.length ;j++ ){
            if (arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return arr;
    }

}
