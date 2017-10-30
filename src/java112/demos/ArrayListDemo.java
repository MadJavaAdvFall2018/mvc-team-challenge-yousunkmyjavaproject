package java112.demos;

import java.util.*;

/** A class to demonstrate List, specifically, ArrayList.
 *  @author pwaite
 */

public class ArrayListDemo {

    /** Demonstrates use of the List interface/ArrayList class
     *  @param args Parameters that are entered on the command line.
     */
    public static void main(String[] args) {
        // instantiate ArrayList
        List<String> myList = createList();

        // print the list using System.out.println
        System.out.println(myList);

        if (myList.contains("and")) {
            System.out.println("Yep, the word 'and' is in the list");
        }

        for (String element : myList) {
            System.out.println(element);
        }


    }

    private static List<String> createList() {
        List<String> myList = new ArrayList<String>();

        // add elements to the list
        myList.add("one");
        myList.add("one");
        myList.add("and");
        myList.add("two");
        myList.add("three");
        return myList;
    }

}
