package A1_Arrays;

import java.util.*;

public class Q20_MajorityElement_2 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,2,3,2,1};
        System.out.println(MajEleBetter(arr));
    }
    public static List<Integer> MajElement(int [] arr){
        List<Integer> list1 = new ArrayList<>();

        int count = 0 ;
        int num = arr.length / 3 ;
        for (int i = 0 ; i < arr.length ;i++){
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    count++ ;
                }
            }
            if (count > num){
                if (list1.contains(arr[i]) == false){
                    list1.add(arr[i]);
                }
            }
            count = 0 ;
        }
        return list1;
    }


//    USING HASHING :
    public static List<Integer> MajEleBetter (int [] arr){
        int count = arr.length / 3 ;
        List<Integer> list1 = new ArrayList<>();
        HashMap<Integer , Integer> Map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            if (!Map.containsKey(arr[i])){
                Map.put(arr[i] , 0) ;
            }
            if (Map.containsKey(arr[i])){
                Map.put(arr[i], Map.get(arr[i]) + 1) ;

                if (Map.get(arr[i]) == count + 1){
                    list1.add(arr[i]);
                }
            }
        }
        return list1;
    }


//    USING BOYER MOORE :
    public static List<Integer> MajorELementOptimal(int [] arr){
        int len = arr.length ;
        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE , element2 = Integer.MAX_VALUE ;

        for (int i = 0 ; i < len ; i++){
            if (count1 == 0 && element2 != arr[i]){
                count1 = 1 ;
                element1 = arr[i];
            }
            else if (count2 == 0 && element1 != arr[i]){
                count2 = 1 ;
                element2 = arr[i];
            }
            else if (element1 == arr[i]) {
                count1++;
            }
            else if (element2 == arr[i]) {
                count2++;
            }
            else {
                count1-- ;
                count2-- ;
            }
        }

        count1 = count2 = 0;
        for (int i = 0 ; i < len ; i++){
            if (element1 == arr[i]){
                count1++ ;
            }
            if (element2 == arr[i]){
                count2++ ;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int min = len/3 ;
        if (count1 > min){
            ans.add(element1);
        }
        if (count2 > min){
            ans.add(element2);
        }

        return ans ;
    }
}

