package java112.demos;

import java.io.*;

/**
 * Demonstrates using PrintWriter.
 *
 * @author Paula Waite
 *
 */
public class WriteDemo {

    /** Writes out a single line into a file. The file name is hard-coded in this
     *  example.
     */
    public void run() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
            out.println("This is the first line");
        } catch (IOException ioException) {
            System.out.println("There was a problem writing the file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem...");
            exception.printStackTrace();
        } finally {
            out.close();
        }
    }

    /** Runs the WriteDemo
      * @param args command line arguments (not used)
      */
    public static void main(String[] args) {
        WriteDemo demo = new WriteDemo();
        demo.run();
    }

}