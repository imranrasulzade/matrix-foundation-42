import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        System.out.println(" 1. Valyuta çevirici\n" +
                " 2. Bədən kütlə indeksi (BMI)\n" +
                " 3. Vergi hesablayıcı\n" +
                " 4. Qiymət/Grade kalkulyatoru\n" +
                " 5. Taksi haqqı hesablayıcı\n" +
                " 6. Üçbucaq növü təyini\n");

        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                // valyuta
                break;
            case 2:
                // bmi
                break;
            case 3:
                //vergi
                break;
            case 4:
                //grade
                break;
            case 5:
                //taxi
                break;
            case 6:
                //ucbucaq
                break;
            default:
                System.out.println("Menu sehv daxil edilib.");
        }










    }
}
