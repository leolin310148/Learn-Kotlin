package me.leolin;

/**
 * @author leolin
 */
public class App {
    public static void main(String[] args) {

    }

    static void printLengthIfString(Object object) {
        if (object instanceof String) {
            System.out.println(((String) object).length());
        } else {
            System.out.println(object + " is not a string");
        }
    }
}
