package java112.labs1;

/** lab 3 unit 1
 *  @author pwaite
 */

public class LabThree {

    /** 
      * Checks that only one argument was entered on the command line
      * and passes it to the run method for display
      *
      * @param args command line arguments
      */
    public static void main(String[] args) {
        LabThree lab = new LabThree();
        
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            lab.run(args[0]);
        }

    }

    /** displays the value passed in
     *  @param something the value to display
     */
    public void run(String something) {
        System.out.println("input: " + something);
    }

}