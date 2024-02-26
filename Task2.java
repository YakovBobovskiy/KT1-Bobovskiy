import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        for (int number = 0; number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 != 0) {
                String str = Integer.toString(number);
                String[] strArr = str.split("");
                java.util.List list = new java.util.ArrayList();

                for (int index = 0; index <= strArr.length - 1; index++) {
                    list.add(Integer.parseInt(strArr[index]));
                }

                int total = 0;

                for (int index = 0; index <= list.size() - 1; index++) {
                    total += (int) list.get(index);
                }

                if (total < 10) System.out.println(number);
            }
        }
    }
}
