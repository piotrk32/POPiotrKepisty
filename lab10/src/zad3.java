import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class zad3
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String > arrstr = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String file = in.next();
        FileReader fr = null;
        String line = "";

        System.out.println(file);

        try
        {
            fr = new FileReader(file);
        }

        catch (FileNotFoundException ex)
        {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        BufferedReader bufr = new BufferedReader(fr);

        while ((line = bufr.readLine()) != null)
        {
            arrstr.add(line);
        }
        Collections.sort(arrstr);
        System.out.println(arrstr);



    }
}
