package java112.demos;

import java.util.*;

/** A class to demonstrate maps containing objects
 *  @author pwaite
 */

public class StudentMapDemo {

    /** Main method to demonstrate use of the Treemap class to
     *  hold a sorted set of mapped data.
     *  @param args Parameters that are entered on the command line.
     */

    public static void main(String args[]) {

        // create a map
        Map<Student, Integer> students = new TreeMap<Student, Integer>();

        students.put(new Student("Jane", "B", "A", 2), 4);
        students.put(new Student("Joe", "P", "A", 3), 3);
        students.put(new Student("Jim", "G", "A", 1), 1);

        System.out.println(students);


        
    }

}
