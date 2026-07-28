import java.util.Random;
import java.util.Scanner;

public class Lesson4 {


    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//        }

//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Neceden:");
//        int left = sc.nextInt();
//
//        System.out.println("Neceye:");
//        int right = sc.nextInt();
//
//
//        for (int i = left; i <= right; i++) {
//            if (i % 23 == 0) {
//                System.out.println(i);
//            }
//        }

//        int i = 0;
//        while(i < 10) {
//            System.out.println("Salam");
//            i++;
//        }

//        // 123
//        System.out.println("Ededi daxil et:");
//        int number = sc.nextInt();
//        int sum = 0;
////        int multiplier = 1;
//        while (number != 0) {
//            int digit = number % 10;
//            sum += digit;
////            multiplier *= digit;
//            number /= 10;
//        }
//        System.out.println(sum);
////        System.out.println(multiplier);


//        do {
//            System.out.println("Salam");
//        } while (true);


//        Random rand = new Random();
//        int number = rand.nextInt(100);
//        int count = 0;
//        int n = 0;
//        do {
//            count++;
//            n = sc.nextInt();
//            if (n > number) {
//                System.out.println("daha kicik yaz");
//            } else if(n < number) {
//                System.out.println("daha boyuk yaz");
//            }
//        }while (n != number);
//        System.out.println(count);


        System.out.println("Eded daxil et:");
        int a = sc.nextInt();
        int reversedA = 0;
        int originalA = a;
        while (a != 0) {
            int digit = a % 10;
            reversedA = reversedA * 10 + digit;
            a /= 10;
        }
        if (originalA == reversedA) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }











    }

}
