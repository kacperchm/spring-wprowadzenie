package pl.edu.wszib.springwprowadzenie;

public class MyPrototype {

    private static final MyPrototype PROTOTYPE = new MyPrototype();

    private MyPrototype() {
    }

    public static MyPrototype getPrototype() {
        try {
            return (MyPrototype) PROTOTYPE.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
