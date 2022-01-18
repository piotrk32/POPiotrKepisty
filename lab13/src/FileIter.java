import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class FileIter
{
    private HashMap<Integer, HashSet<String>> codes;

    public FileIter(String file) throws FileNotFoundException
    {

        this.codes = new HashMap<>();
        try
        {
            File source = new File(file);
            Scanner sc = new Scanner(source);

            while(sc.hasNext())
            {
                String word = sc.next();
                boolean check = false;
                for (int i : this.codes.keySet())
                {
                    if(word.hashCode() == i)
                    {
                        check = true;
                        break;
                    }
                }
                if (!check)
                {
                    this.codes.put(word.hashCode(), new HashSet<>());
                }
                this.codes.get(word.hashCode()).add(word);

            }
            this.print_words();

        }
        catch (Exception e)
        {
            e.getStackTrace();
        }


    }

    public void print_words()
    {
        for (int i : this.codes.keySet())
        {
            if(this.codes.get(i).size() > 1)
            {
                System.out.println(i + ":");
                for (String w: this.codes.get(i))
                {
                    System.out.println(" " + w);
                }
            }

        }
    }


}
