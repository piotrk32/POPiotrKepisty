package pl.piotrjd.kepisty;
import java.time.LocalDate;
import pl.piotrjd.kepisty.Student;
public class Osoba implements Cloneable, Comparable <Osoba>
{
    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba (String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public  String toString()
    {
        return this.getClass().getName() + " ["+ this.nazwisko + " " + this.dataUrodzenia + "]";
    }
    public int compareTo(Osoba osoba)
    {
        int tmp = this.nazwisko.compareTo(osoba.nazwisko);
        if (tmp != 0)
        {
            return tmp;
        }
        if (tmp == 0)
        {
            tmp = this.dataUrodzenia.compareTo(osoba.dataUrodzenia);
        }
        return tmp;
    }
    public boolean equals(Osoba osoba)
    {
        if (this.nazwisko == osoba.nazwisko && this.dataUrodzenia == osoba.dataUrodzenia)
        {
            return true;
        }
        return false;
    }
}
