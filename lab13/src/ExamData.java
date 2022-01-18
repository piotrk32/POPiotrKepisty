import java.util.*;

public class ExamData
{
    private TreeMap<String,String> grades;
    public ExamData()
    {
        this.grades= new TreeMap<>();
    }

    public void add_student(String second_name, String grade)
    {
        this.grades.put(second_name, grade);
    }

    public void remove_by_name(String name)
    {
        for(String n: this.grades.keySet())
        {
            if(n.equals(name))
            {
                this.grades.remove(name);
            }
        }
    }
    public void change_data(String second_name, String grade)
    {
        for(String n: this.grades.keySet())
        {
            if(n.equals(second_name))
            {
                this.grades.replace(second_name, grade);
            }
        }
    }
    public void print_data()
    {
        for (String student : this.grades.keySet())
        {
            System.out.println(student+" : " + this.grades.get(student));
        }
        System.out.println();
    }


}