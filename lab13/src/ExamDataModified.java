import java.util.*;

public class ExamDataModified
{
    private TreeMap<StudentData, String> grades_tm;
    private TreeMap<Integer, StudentData> id_tm;

    public ExamDataModified()
    {
        this.grades_tm = new TreeMap<>();
        this.id_tm = new TreeMap<>();
    }
    public void add_student(StudentData student, String grades)
    {
        this.grades_tm.put(student, grades);
        this.id_tm.put(student.get_id(), student);
    }

    public void remove_id(int id)
    {
        for(int i: this.id_tm.keySet())
        {
            if (i == id)
            {
                this.grades_tm.remove(this.id_tm.get(id));
            }
        }
        this.id_tm.remove(id);
    }

    public void change_id(int id, String ocena)
    {
        for(StudentData student: this.grades_tm.keySet())
        {
            if(student.get_id() == id)
            {
                this.grades_tm.replace(this.id_tm.get(id), ocena);
            }
        }
    }
    public void print_data2()
    {
        for (StudentData student: this.grades_tm.keySet())
        {
            System.out.println(student.get_second_name()+" "+ student.getName()+" "+ student.get_id() + " : "+ this.grades_tm.get(student));
        }
        System.out.println();
    }


}