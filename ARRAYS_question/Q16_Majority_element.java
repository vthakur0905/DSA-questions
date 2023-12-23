package A1_Arrays;

import java.util.HashMap;

//link - https://leetcode.com/problems/majority-element/description/
public class Q16_Majority_element {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,1,2,2};
        System.out.println(MajorityElementBrute(arr));
        System.out.println(MajorityElementBrute(arr));
        System.out.println(MajorityElementOptimal(arr));

    }

//     BRUTE FORCE APPROACH - TRAVERSE THE ARRAY FOR EACH ELEMENT'S COUNT.
    public static int MajorityElementBrute(int [] arr){
        int n = arr.length/2 ;
        for (int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    count++ ;
                }
            }
            if (count > n){
                return arr[i] ;
            }
        }

        return -1;
    }

//    BETTER APPROACH - USING HASHMAP
    public static int MajorityElementBetter(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = arr.length/2 ;
        for (int i = 0 ; i < arr.length ; i++ ){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for (int key : map.keySet()){
            if (map.get(key) > num){
                return key;
            }
        }
        return -1;
    }

//    OPTIMAL APPROACH - USING BOYER MOYER VOTING APPROACH
    public static int MajorityElementOptimal(int [] arr){
        int n = arr.length, count = 0 , el = 0 ;

        for (int i = 0; i < arr.length ; i++){
            if(count == 0){
                el = arr[i];
                count = 1 ;
            }
            else if(el == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == el){
                count1++ ;
            }
        }
        if (count1 > (n/2)){
            return el;
        }


        return -1;
    }
 }
