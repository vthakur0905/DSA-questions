package A1_Arrays;
import java.util.ArrayList;

public class Q04_Left_Rotate_By_K_Arraylist {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // int l = arr.size();
        if (k > arr.size()) {
            k = k % arr.size();
        }

        for (int i = 0; i < k; i++) {
            int temp = arr.get(arr.size() - 1);
            for (int j = 1 ; j < arr.size() ; j++) {
                arr.set(j, arr.get(j+1));
            }
            arr.set(arr.size()-1, temp);
        }

        return arr;
    }
}


