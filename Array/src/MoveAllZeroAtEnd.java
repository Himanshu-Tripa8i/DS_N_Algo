import java.util.Arrays;
import java.util.List;

public class MoveAllZeroAtEnd {

    public static int[] moveZeroAtTheEnd(int[] arr) {
        int j = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;

                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] val = moveZeroAtTheEnd(new int[]{10, 11, 0, 5, 0, 0, 21, 0, 9});
       System.out.println (Arrays.toString(val));

    }
}
