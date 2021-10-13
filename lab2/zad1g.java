import java.util.Scanner;
public class zad1g {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n<=0){

            System.out.println("Liczba musi byc dodatnia");

        }
        else {
            int suma1 = 0;
            int iloczyn1 = 1;
            int i = 0;
            while (i != n) {
                int k = in.nextInt();
                int m = k;
                suma1 += k;
                iloczyn1*=m;
                i++;
            }
            System.out.println(suma1);
            System.out.println(iloczyn1);
        }
    }
}
