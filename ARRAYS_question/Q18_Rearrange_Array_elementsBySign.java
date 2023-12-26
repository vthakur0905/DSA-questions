package A1_Arrays;

import java.util.Arrays;

public class Q18_Rearrange_Array_elementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(Optimalrearrange(arr)));

    }
    public static int[] Optimalrearrange(int [] arr){
        int po = 0;
        int ne = 1;
        int[] mod = new int[arr.length];

        for (int i = 0 ; i < arr.length  ; i++){
            if(arr[i] >= 0){
                mod[po] = arr[i];
                po = po + 2;
            }
            else{
                mod[ne] = arr[i];
                ne = ne + 2;
            }
        }
        return mod ;
    }
}
