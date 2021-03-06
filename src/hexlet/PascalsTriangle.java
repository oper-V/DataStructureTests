package hexlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        //PascalsTriangle t = new PascalsTriangle();
        triangle(4);
    }



    public static ArrayList<Integer> triangle(int rowNumber) {
        //BEGIN (write your solution here)
    /*
    Чтобы найти следующую строку в треугольнике, нужно взять предыдущую,
    и прибавить к ней точно такую же, но сдвинутую на одну колонку вправо.
    */
        ArrayList<Integer> prevLine = new ArrayList<>();
        ArrayList<Integer>  resultLine = new ArrayList<>();

        for( int i = 0; i <= rowNumber; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) { //если первое число в строке, то это 1
                    resultLine.clear();
                    resultLine.add(1);
                } else {
                    // Иначе
                    resultLine.add(j, (prevLine.get(j) + prevLine.get(j - 1)));
                }
            }
            // Нужно использовать clone() вместо присваивания =
            prevLine = (ArrayList<Integer>) resultLine.clone();
            prevLine.add(0);

        }

        System.out.println(resultLine.toString());
        return  resultLine;

        //END
    }


}