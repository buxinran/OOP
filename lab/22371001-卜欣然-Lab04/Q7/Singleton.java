package lab04;

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();


    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void foo() {
        System.out.println("Aha!");
    }
}
class testSingleton {
    public static void main(String[] args) {
        Singleton.getInstance().foo();
    }
}