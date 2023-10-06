package A1_Arrays;

// Ques Link = https://leetcode.com/problems/max-consecutive-ones/description/

// approach = Take two counter max and count, when found 1 update max and count, update max only when max < count, if one is not found reset counter to 0

public class Q12_Max_Consecutive_1 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,0,1,1};
        System.out.println(consecutive(arr));
    }

    static int consecutive(int [] arr) {
        int max = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1){
            counter++;
            if(counter > max){
                max++;
            }
        }
        else{
            counter = 0;
        }

        }
        return max;
    }
}
