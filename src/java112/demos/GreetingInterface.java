package java112.demos;
 
/**
 * @author Eric Knapp
 */
public interface GreetingInterface {
 
    //String createGreeting(String person, String greeting);

    default String createGreeting(String person, String greeting) {
        return greeting + ", " + person + "!";
    }
 
}