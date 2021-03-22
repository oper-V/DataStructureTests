package hexlet;

import java.util.ArrayList;

public class SameParityFilter {
    //BEGIN (write your solution here)

    public static ArrayList<Integer> same_parity_filter(ArrayList<Integer> inputList) {
        ArrayList<Integer> result = new ArrayList<>();
        if (inputList.size() == 0) { //Проверка на пустой массив
            return result;
        }
        if (isEven(inputList.get(0))) {
            for (Integer i : inputList) {
                if (isEven(i)) {
                    result.add(i);
                }
            }
        } else {
            for (Integer i : inputList) {
                if (!isEven(i)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private static boolean isEven(Integer number) {
        return number.intValue() % 2 == 0;
    }

    //END
}