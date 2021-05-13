package workWithNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println(getNumbers(intList));

    }

    public static List<Integer> getNumbers(List<Integer> intList) {
        List<Integer> list = new ArrayList<>();
        for (Integer integer : intList) {
            if (integer > 0) {
                if (integer % 2 == 0) {
                    list.add(integer);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
