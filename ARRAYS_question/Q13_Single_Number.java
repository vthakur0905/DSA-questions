package A1_Arrays;

// Ques link = https://leetcode.com/problems/single-number/description/

public class Q13_Single_Number {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
//        approach 1 :
        System.out.println(singleNumber(arr));

//        approach 2 :
        System.out.println(singleNumber1(arr));
    }

//    approach 1 (brute) = iterate through the whole array and keep a count variable.
    public static int singleNumber(int[] arr) {
        int i = 0, j = 0;
        int count = 0;

        while (i < arr.length) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                return arr[i];
            }
            i++;
        }
        return -1;
    }

//    approach 2 (optimal) = use xor approach, apply xor to all elements.
    public static int singleNumber1(int[] arr) {
        int xor = 0;
        for ( int i = 0 ; i < arr.length ; i++){
            xor = xor ^ arr[i];
        }
        return xor;
}


}
