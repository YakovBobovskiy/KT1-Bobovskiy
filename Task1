import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 6};
        int target = 5;
        boolean isExist = false;

        for (int index = 0; index <= arr.length - 1; index++) {
            if (arr[index] == target) {
                isExist = true;

                System.out.print(index);

                break;
            }
        }

        if (!isExist) {
            int[] newArr = new int[arr.length + 1];

            for (int index = 0; index <= arr.length - 1; index++) {
                int value = arr[index];

                newArr[index] = value;
            }

            newArr[arr.length] = target;

            Arrays.sort(newArr);

            for (int index = 0; index <= newArr.length - 1; index++) {
                if (newArr[index] == target) {
                    System.out.print(index);

                    break;
                }
            }
        }
    }
}
