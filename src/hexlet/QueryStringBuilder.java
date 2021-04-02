package hexlet;

import java.util.*;

public class QueryStringBuilder {

    //BEGIN (write your solution here)
    public static String buildQueryString(final Map<String, String> parameters) {

        final Map sortedParameters = new TreeMap(parameters);
        String result = new String();
        for(Object p : sortedParameters.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) p;
            String mapEntryString = String.valueOf(mapEntry.getKey()) + "=" + String.valueOf(mapEntry.getValue());
            if(result.length() == 0) {
                result = mapEntryString;
            } else {
                result = result + "&" + mapEntryString;
            }
        }
        return result;
    }

    //END
}