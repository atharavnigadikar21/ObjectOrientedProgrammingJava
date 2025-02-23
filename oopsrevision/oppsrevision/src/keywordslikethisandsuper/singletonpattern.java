package keywordslikethisandsuper;

class Singleton{

    private static  Singleton instance;

    private Singleton(){ }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Create the instance if it doesn't exist
        }
        return instance;
    }
    
}
public class singletonpattern {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

    }
}
