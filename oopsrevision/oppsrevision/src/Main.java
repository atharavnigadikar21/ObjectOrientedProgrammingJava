 class Singleton {
    // Static variable to hold the one instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {}

    //Static method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Create the instance if it doesn't exist
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Get two references to the Singleton object
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Print the memory addresses of both references
        System.out.println("Address of singleton1: " + System.identityHashCode(singleton1));
        System.out.println("Address of singleton2: " + System.identityHashCode(singleton2));

        // Check if both references point to the same object
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("The references point to different instances.");
        }
    }
}
