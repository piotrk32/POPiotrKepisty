import pl.piotrjd.kepisty.Osoba;
import pl.piotrjd.kepisty.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.lang.Cloneable;
import java.time.LocalDate;

public class TestStudent
{
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa1 = new ArrayList<Osoba>();
        LocalDate d1 = LocalDate.of(1997, 01, 01);
        LocalDate d2 = LocalDate.of(1996, 02, 22);

        grupa1.add(new Student("Kasztan", d1, 3.0));
        grupa1.add(new Student("Ciec", d1, 3.0));
        grupa1.add(new Student("Kleszcz", d1, 5.0));
        grupa1.add(new Student("Kepisty", d2, 4.5));
        grupa1.add(new Student("Lalus", d2, 3.3));
        grupa1.add(new Student("Cwiek", d2, 4.1));

        System.out.println(grupa1);
        Collections.sort(grupa1);
        System.out.println(grupa1);
    }

}
