package A1_Arrays;

public class Q14_Longest_SubArray_with_sum_k_Only_positives {
    public static void main(String[] args) {

        int [] arr = {-1,-1,1};
        System.out.println(count_optimal(arr, 0));


    }
    public static int count_optimal(int [] arr , int k){
        int left = 0 ,right =0 , maxlen = 0;
        int sum = arr[0];

        while (right < arr.length){
            if (left <= right && sum > k){
                sum = sum - arr[left];
                left++;
            }
            if (sum == k){
                maxlen = Math.max(maxlen , right - left + 1);
            }

            right++;
            if (right < arr.length){
                sum = sum + arr[right];
            }

        }

        return maxlen ;
    }

    public static int SubArray(int [] arr , int k){
        int left = 0 , right = 0, ans = 0 ;
        int sum = arr[0];

        while ( right < arr.length - 1){

            while (left <= right && sum > k){
                sum = sum - arr[left];
                left++;
            }

            if (sum == k){
                ans++;
            }

            right++;
            if(right < arr.length){
                sum = sum + arr[right];
            }
        }
        return ans;
    }


    public static int NoOfSubArray(int [] arr , int k){
        int len = 0 ,ans = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++){

                int sum1 = 0;
                sum1 = sum(arr , i , j);

                if (sum1 == k){
                    ans++;
                }

            }

        }
        return ans;
    }
    public static int longestSubArray(int [] arr , int n , int k){
        int len = 0 ,ans = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++){

                int sum1 = 0;
                sum1 = sum(arr , i , j);

                if (sum1 == k){
                    int temp = j - i + 1;
                    ans = Math.max(temp , len );
                }

            }

        }
        return ans;
    }

    public static int sum(int [] arr , int start , int end){
        int ans = 0;

        for (int i = start; i <= end ; i++){
            ans = ans + arr[i];
        }

        return ans;
    }
}
