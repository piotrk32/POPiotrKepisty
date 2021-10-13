import java.util.Scanner;
import static java.lang.Math.*;
public class zad1e {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {

            System.out.println("Liczba musi byc dodatnia");

        } else {
            int iloczynwartbezw = 1;
            int i = 0;
            while (i != n) {
                int k = in.nextInt();
                iloczynwartbezw *=abs(k);
                i++;
            }
            System.out.println(iloczynwartbezw);
        }
    }
}