package hexlet;

import java.util.*;

public class SumOfIntervals {

    //BEGIN (write your solution here)
/*
    private static List<List<int>> intervals;
    static List<List<Integer>> a = Arrays.asList(
            Arrays.asList(1, 5),
            Arrays.asList(9, 19),
            Arrays.asList(1, 7),
            Arrays.asList(16, 19),
            Arrays.asList(5, 11)
    );

    public static void main(String ... args) {
        System.out.println(a.toString());
        System.out.println("***************");
        //Collections.sort(a);
        a.sort(Comparator.na);
        System.out.println(a.toString());
    }
*/

    public static int sumOfIntervals(List<List<Integer>> intervals) {

        int result = 0;

        for(List<Integer> item : intervals) {
          result = result + item.get(1) - item.get(0);
        }
        return result;

    }


    //END
}