package pl.edu.wszib.springwprowadzenie;

public class MySingleton {

    private static final MySingleton INSTAMCE = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstamce() {
        return INSTAMCE;
    }
}
