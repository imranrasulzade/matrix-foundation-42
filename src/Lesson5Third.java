import java.util.Scanner;

public class Lesson5Third {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println(hasil);
    }

}
