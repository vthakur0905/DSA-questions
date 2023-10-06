package A1_Arrays;

// Ques link = https://www.codingninjas.com/studio/problems/linear-search_6922070?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

//approach = simply iterate through the array and if element is found return the index else return -1.

public class Q10_linear_Search {
    public static void main(String[] args) {
        int [] arr = { 2,3,5,6,12,45,67};
        System.out.println(linearSearch(7,12,arr));
    }
    public static int linearSearch(int n, int num, int []arr){

        for (int i = 0; i < n ; i++){
            if (arr[i] == num){
                return i ;
            }

        }
        return -1;
    }
}
