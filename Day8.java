import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {52, 14, 54, 85};
        int length = arr.length;
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("After Reversing the digits are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
