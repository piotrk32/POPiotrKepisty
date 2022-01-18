

public class StudentData implements Comparable<StudentData>
{
    private String name;
    private String second_name;
    private int id;

    public StudentData(String name, String second_name, int id)
    {
        this.name = name;
        this.second_name = second_name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public String get_second_name()
    {
        return second_name;
    }

    public int get_id()
    {
        return id;
    }

    @Override
    public int compareTo(StudentData o)
    {
        if(this.second_name.compareTo(o.get_second_name()) <= 0)
        {
            if(this.name.compareTo(o.getName()) <= 0)
            {
                if(this.id < o.get_id())
                {
                    return -1;
                }
                else if(this.id == o.get_id())
                {
                    return 0;
                }
                return 1;
            }
            return this.name.compareTo(o.getName());
        }
        return this.second_name.compareTo(o.get_second_name());
    }
}