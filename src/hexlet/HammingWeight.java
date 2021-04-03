package hexlet;

import java.util.Arrays;
import java.util.List;

public class HammingWeight {
    //BEGIN (write your solution here)
    public static int hammingWeight(int num) {
        //Integer number = Integer.valueOf(num);
        int result = 0;
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for(char i : chars) {
            if (i == '1') result++;
        }
        return result;
    }

    //END
}