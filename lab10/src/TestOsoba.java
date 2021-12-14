import pl.piotrjd.kepisty.Osoba;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.lang.Cloneable;
import java.time.LocalDate;


public class TestOsoba
{
    public static void main(String[] args)
    {
        ArrayList <Osoba> grupa1 = new ArrayList<Osoba>();
        LocalDate d1 = LocalDate.of(1997, 01, 01);
        LocalDate d2 = LocalDate.of(1996, 02, 22);


        grupa1.add(new Osoba("Kasztan", d1));
        grupa1.add(new Osoba("Ciec", d1));
        grupa1.add(new Osoba("Kleszcz", d1));
        grupa1.add(new Osoba("Kepisty", d2));
        grupa1.add(new Osoba("Lalus", d2));
        grupa1.add(new Osoba("Cwiek", d2));

        System.out.println(grupa1);
        Collections.sort(grupa1);
        System.out.println(grupa1);


    }


}
