package A1_Arrays;

import java.util.ArrayList;

public class Q07_Union_Of_Arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = {4,5,6,7,8,9};

        System.out.println(merge(arr, arr1));
    }

    public static ArrayList<Integer> merge(int [] a , int [] b){

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i = 0; i < a.length ; i++){
            list1.add(a[i]);
        }

        for (int j = 0 ; j < b.length ; j++){
            if (!find(a , b[j])){
                list1.add(b[j]);
            }
        }

        return list1 ;
    }
    public static boolean find(int [] arr , int num){
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == num){
                return true ;
            }
        }
        return false;
    }
}
