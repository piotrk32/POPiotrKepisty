import java.util.*;

public class PriorityList
{
    private PriorityQueue <Task> list;
    public PriorityList()
    {
        this.list = new PriorityQueue<>();
        this.stream_task();


    }
    public void stream_task()
    {
        Scanner sc = new Scanner(System.in);
        String [] words;
        String line = sc.nextLine();
        Iterator<String> iter;
        while (!line.equals("zakoncz"))
        {
            words = line.split(" ");
            iter = Arrays.stream(words).iterator();

            if(iter.hasNext())
            {
                iter.next();
                if (words[0].equals("dodaj"))
                {
                    System.out.println("Dodano polecenie");
                    int priority = 0;

                    StringBuffer opis = new StringBuffer();
                    if (iter.hasNext())
                    {
                        priority = Integer.parseInt(iter.next());
                    }
                    while(iter.hasNext())
                    {
                        opis.append(iter.next());
                        opis.append(" ");
                    }
                    list.add(new Task(priority, opis.toString()));


                }

                else if (words[0].equals("nastepne"))
                {
                    list.remove();
                    System.out.println("Usunieto polecenie");
                }

                else
                {
                    System.out.println("Nie rozpoznano polecenia");
                }

            }
            line = sc.nextLine();


        }


    }
    public void print_task()
    {
        PriorityQueue<Task> copy = new PriorityQueue<>(this.list);
        while (!copy.isEmpty())
        {
            Task t = copy.remove();
            System.out.println("Priorytet: " + t.priority);
            System.out.println("Opis: " + t.opis);
        }

    }
}

class Task implements Comparable<Task>
{
    int priority;
    String opis;


    public Task(int priority, String opis)
    {
        this.priority = priority;
        this.opis = opis;
    }

    @Override public int compareTo(Task t)
    {
        return Integer.compare(this.priority, t.priority);
    }

}
