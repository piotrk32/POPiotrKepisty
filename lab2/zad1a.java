import java.util.Scanner;
public class zad1a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n<=0){

            System.out.println("Liczba musi byc dodatnia");

        }
        else {
            int suma = 0;
            int i = 0;
            while (i != n) {
                int k = in.nextInt();
                suma += k;
                i++;
            }
            System.out.println(suma);
        }
    }
}
