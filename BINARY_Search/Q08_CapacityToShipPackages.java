package A2_BinarySearch;

// ques link -> https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class Q08_CapacityToShipPackages {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
//        System.out.println(shipBinary(arr,5));
    }

    // Approach 1 - using linear search
    public static int ShipLinear(int [] arr, int d){
        int max = maxELe(arr);
        int totalWeight = sum(arr);

        for (int i = max ; i <= totalWeight ; i++){
            if (totalDays(arr, i) <= d){
                return i ;
            }
        }
        return -1;
    }

//     approach 2 -> using simple for loop
    public static int bruteSimpleMissingNumber(int [] arr, int k){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] <= k) k++; //shifting k
            else break;
        }
        return k;
    }
    public static int totalDays(int [] arr , int weight){
        int days = 1 ;
        int load = 0 ;
        for (int i = 0; i < arr.length ; i++){

            if (load + arr[i] > weight){
                days++ ;
                load = arr[i] ;
            }
            else{
                load += arr[i] ;
            }
        }
        return days;
    }

    public static int maxELe(int [] arr){
        int max = 0 ;
        for (int i = 0; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int sum(int [] arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
}
