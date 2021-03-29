package hexlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DnaToRna {

    //BEGIN (write your solution here)
    public static String dnaToRna(String dna) {

        Map<Character, Character> dictDnaToRna =  new HashMap();
        dictDnaToRna.put('G', 'C');
        dictDnaToRna.put('C', 'G');
        dictDnaToRna.put('T', 'A');
        dictDnaToRna.put('A', 'U');
        String result = new String();
        
        if (dna == null) return  null;
        if (dna.length() == 0) return new String();

        char[] dnaArray = dna.toCharArray();
        
        for (char i : dnaArray) {
            if (!dictDnaToRna.keySet().contains(i)) return  null;
        }

        for (char i : dnaArray) {
           result = result.concat(dictDnaToRna.get(i).toString());
        }

        return result;
    }

    //END
}