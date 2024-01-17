package A2_BinarySearch;

// question link -> https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/


public class Q07_FindSmallestDivisor {
    public static void main(String[] args) {
        int [] arr = {44,22,33,11,1} ;
        System.out.println(divisor(arr,5));



    }


    //    approach 1 - using linear search.

    public static int divisor (int [] arr, int t){
        for (int d = 1 ; d <= max(arr) ; d++){
            int sum = 0;
            for (int i = 0; i < arr.length ; i++){
                sum += Math.ceil((double)(arr[i]) / (double)(d));
            }
            if (sum <= t){
                return d ;
            }
        }
        return -1;
    }

    //    approach 2 - using binary search
    public static int divisorBinarySearch (int [] arr ,int t){
        int low = 0;
        int high = max(arr);
        int div = 0 ;

        while (low <= high){
            int mid = low + (high-low)/2 ;

            if(sumCheck(arr , mid) <= t){
                div = mid ;
                high = mid - 1 ;

            }
            else {
                low = mid + 1 ;
            }
        }
        return div;
    }

    public static int sumCheck(int [] arr, int mid){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++){
            sum += Math.ceil((double)(arr[i]) / (double)(mid));
        }
        return sum ;
    }

    public static int max (int [] arr){
        int max = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i] ;
            }
        }
        return max;
    }
}
