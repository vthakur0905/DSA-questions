package A1_Arrays;

// Ques link = https://leetcode.com/problems/missing-number/

//  approach : sum approach : take sum of both arrays and subtract it

public class Q11_Missing_numbers {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 1};
        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {

        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum2 = sum2 + arr[i];
        }
        return sum - sum2;
    }

}
