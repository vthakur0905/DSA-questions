package A1_Arrays;
//import java.util.Scanner;

// Ques - https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class Q01_Second_largest_Element {

    public static void main(String[] args) {

    }

    public static int largest(int [] arr){
        int l = Integer.MIN_VALUE ;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > l){
                l = arr[i];
            }
        }
        return l;

    }

    public static int smallest(int [] arr){
        int s = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if ( arr[i] < s){
                s = arr[i];
            }
        }
        return s ;
    }

    public static int secondSmallest (int [] arr){
        int s = smallest(arr);
        int sm = Integer.MAX_VALUE ;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < sm && arr[i] != s){
                sm = arr[i];
            }
        }
        return sm;

    }

    public static int secondlargest (int [] arr){
        int l = largest(arr);
        int sl = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++){
            if (arr[i] > sl && arr[i] != l){
                sl = arr[i];
            }
        }
        return sl ;
    }


}
