import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
//        int[] array = new int[4];
//
//        };
//        System.out.println(numbers[1][2]);

        int[] numbers = {8, 6, 9, 2, 4};

        String[] names = {"Huseyn", "Firangiz", "Firangiz", "Kanan", "Farid", "Xanim", "Gulsen"};
//        array[0] = 8;
//        array[1] = 9;
//        array[2] = 10;
//        array[3] = 20;

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);

//        for (int i = 0; i < 4; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        System.out.println(names.length);

//        for(int i = 0; i < names.length; i++) {
//            names[i] = "Salam";
//        }

        for (String n : names) {
            n = "Salam";
        }
        for (String n : names) {
            System.out.println(n);
        }


    }

}
