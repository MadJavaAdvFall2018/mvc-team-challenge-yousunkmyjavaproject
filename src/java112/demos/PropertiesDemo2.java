package java112.demos;

import java.io.*;
import java.util.*;
import java112.utilities.*;

/**
 * @author Paula Waite
 * 
 *
 */
public class PropertiesDemo2 implements PropertiesLoaderInterface {

    private Properties properties;

    public void run(String path) {

        properties = loadProperties(path);

        System.out.println("author: " + properties.getProperty("author"));
        System.out.println("email: " + properties.getProperty("email"));
    }

    public static void main(String[] arguments) {
        PropertiesDemo2 demo = new PropertiesDemo2();
        demo.run(arguments[0]);
    }

}