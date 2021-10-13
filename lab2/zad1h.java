import java.util.Scanner;
import static java.lang.Math.*;
public class zad1h {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {

            System.out.println("Liczba musi byc dodatnia");

        } else {
            int rownanie = 1;
            int i = 0;
            while (i != n) {
                int k = in.nextInt();
                rownanie += Math.pow(-1, n+1)*k ;
                i++;
            }
            System.out.println(rownanie);
        }
    }
}