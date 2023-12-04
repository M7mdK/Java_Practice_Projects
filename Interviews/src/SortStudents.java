import java.util.Comparator;

public class SortStudents implements Comparator<Student>{
    
    @Override
    public int compare(Student s1 , Student s2){
        return s1.getMark() - s2.getMark(); //Ascending marks
        //return s2.getMark() - s1.getMark(); //Descending marks
    }
}
