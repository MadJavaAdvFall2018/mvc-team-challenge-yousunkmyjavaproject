package java112.demos;

import java.util.*;

/** A class to demonstrate maps
 *  @author pwaite
 */

public class MapDemo {

    /** Main method to demonstrate use of the Treemap class to
     *  hold a sorted collection of mapped data.
     *  @param args Parameters that are entered on the command line.
     */

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<String, Integer>();

        map.put("abc", 4);
        map.put("123", 5);
        map.put("def", 6);
        map.put("abc", 10);

        System.out.println(map);
        System.out.println();

        System.out.println("use containsKey to check for a key in the map: 123 ");

        if (map.containsKey("123")) {
            System.out.println("The key 123 has a value of " + map.get("123"));
        }

        System.out.println();
        System.out.println("Iterate over the map using for");

        // Iterate over the map, writing out each key-value pair
        // for each "thing" in my collection do something {}
        // example: for (String myString: listOfStrings) {}

        for (Map.Entry<String, Integer> entry:  map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);

        }
        



    }

}
