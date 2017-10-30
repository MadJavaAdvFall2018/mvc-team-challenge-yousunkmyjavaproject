package java112.demos;

import java.util.*;
import java.io.*;

/** Demonstrate the use of the Properties class
 *  @author pawaite
 */
public class PropertiesDemo {

    /**
     * Starts the properties demo
     *
     * @param args Command Line arguments
     */
    public static void main(String[] args) {
        PropertiesDemo demo = new PropertiesDemo();
        demo.run();
    }

    public void run() {
        // instantiate Properties
        Properties properties = new Properties();
           
        try {
            // Read in the file
            properties.load(this.getClass().getResourceAsStream("/demo.properties"));
        } catch (IOException ioe) {
            // include a nice message
            ioe.printStackTrace();

        } catch (Exception e) {
            // include a nice message
            e.printStackTrace();
        }

     
        // find the key/property called "author" and write out the value
        System.out.println(properties.getProperty("author"));  

        // Get a list of the keys, aka, property names

        Set<String> propertyNames = properties.stringPropertyNames();

         //Write out all the property names/keys
        System.out.println("The set of property names" + propertyNames);


        // iterate over the property names, writing out each value
         for (String key : propertyNames) {
            String value = properties.getProperty(key);
            System.out.println(key + " => " + value);
        }



    }
}
