import java.util.Scanner;
import static java.lang.Math.*;
public class zad1c {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {

            System.out.println("Liczba musi byc dodatnia");

        } else {
            int wartbezw = 0;
            int i = 0;
            while (i != n) {
                int k = in.nextInt();
                wartbezw +=abs(k);
                i++;
            }
            System.out.println(wartbezw);
        }
    }
}