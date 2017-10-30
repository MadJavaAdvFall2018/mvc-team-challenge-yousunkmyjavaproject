package java112.labs1;

/** Lab 2 - It's a mystery
 *  Used to practice with TDD
 *  The program will output 1
 *  
 * @author pwaite
 */

public class MysteryClassOne {

    /** method to run the MysteryClass application
     *  Call the mysteryMethodOne and output value
     *  @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("You typed: " + args[0]);
        MysteryClassOne demo = new MysteryClassOne();
        System.out.println(demo.mysteryMethodOne());
    
    }


    /** method that returns 1
     * @return a mystery value
     */
    public int mysteryMethodOne() {
	//adding a comment for the git demo
        return 1;

    }

}
