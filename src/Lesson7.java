import java.util.Random;

public class Lesson7 {

    static void sayHello() {
        System.out.println("Hello1");
    }

    static int plus(int a, int b) {
        System.out.println("Salam ededler toplanir");
        int sum = a + b;
        return sum;
    }
    static double plus(double a, double b) {
        System.out.println("Salam ededler toplanir");
        return a + b;
    }

    static void mergeTextWithNumber(String text, int n) {
        System.out.println(text + n);
    }

    static void mergeTextWithNumber(int n, String text) {
        System.out.println(text + n);

    }


    static int generateOtp() {
        int random = new Random().nextInt(1000);
        return random;
    }


    public static void main(String[] args) {

        sayHello();
        int o = 85;
        int cem = plus(o, 9);

        double cem1 = plus(7.2, 6.3);
        System.out.println(cem);

        mergeTextWithNumber(8, "Matrix");
        mergeTextWithNumber("Matr", 85);

        System.out.println(Math.pow(2, 8));


    }

}
