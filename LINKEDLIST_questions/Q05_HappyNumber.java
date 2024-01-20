package A04_LinkedList;

// ques link -> https://leetcode.com/problems/happy-number/

public class Q05_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = FindSquare(slow);
            fast = FindSquare(FindSquare(fast));
        }while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;

        //  approach used -> we have to detect cycle using slow and fast pointer.
    }
    public static int FindSquare(int num){
        int ans = 0;
        while (num > 0 ){
            int rem = num % 10 ;
            ans = ans + rem*rem ;
            num = num / 10 ;
        }

        return ans ;
    }
}
