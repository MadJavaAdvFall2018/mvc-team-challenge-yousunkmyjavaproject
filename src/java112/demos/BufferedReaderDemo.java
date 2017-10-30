package java112.demos;

import java.io.*;
/**
 * Demonstrate reading a file and exception handling (try-with-resources)
 *
 * @author Paula Waite
 */

public class BufferedReaderDemo {
    /** Runs the BufferedReaderDemo
     * @param args The command line arguments, not used in this case
     */
    public static void main(String[] args) {
        BufferedReaderDemo demo = new BufferedReaderDemo();
        demo.run();
    }

    /**
     *  Reads in a hard-coded file name and displays the 
     *  lines in the file.
     */
    public void run() {
        // FileReader fileReader = new FileReader("foo.in");
        // BufferedReader in = new BufferedReader(fileReader);
        // 2 lines above accomplish the same thing as the following
        // chaining - chaining constructors together

        try (BufferedReader in = new BufferedReader(new FileReader("temp/foo.in"))) {
            while (in.ready()) {
                System.out.println(in.readLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file wasn't found");
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException) {
            System.out.println("The file couldn't be read");
            ioException.printStackTrace();
        }
        catch (Exception exception) {
            System.out.println("Something really really went wrong...");
            exception.printStackTrace();
        }
    }
}