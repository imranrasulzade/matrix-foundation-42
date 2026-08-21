package lesson13;

public interface Flyable {

    void fly();

    static void test() {
        System.out.println("test");
    }

    default void print() {
        System.out.println("print");
    }
}
