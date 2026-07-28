import java.util.Scanner;

public class Lesson5Second {

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            String menuMessage = "nə etmək istəyirsən\n" +
                    "1. Topla\n" +
                    "2. Çıx\n" +
                    "3. Vur\n" +
                    "4. Böl\n" +
                    "5. Proqramı dayandır\n";

            System.out.println(menuMessage);


            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 5) {
                running = false;
                continue;
            }
            System.out.println("Birinci ededi daxil et:");
            int firstNumber = input.nextInt();

            System.out.println("Ikinci ededi daxil et:");
            int secondNumber = input.nextInt();


            switch (choice) {
                case 1:

                    System.out.println(firstNumber + secondNumber);
                    break;
                case 2:
                    System.out.println(firstNumber - secondNumber);
                    break;
                case 3:
                    System.out.println(firstNumber * secondNumber);
                    break;
                case 4:
                    System.out.println(firstNumber / secondNumber);
                    break;
                default:
                    System.out.println("Sehv daxil olunub");
            }
        }

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }


    }
}
