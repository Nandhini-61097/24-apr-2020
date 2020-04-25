import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class StudentStream {
 
    public static void main(String a[]) {
 
        List<Student> empList = new ArrayList<>();
        empList.add(new Student(1,"Nandhini", 80));
        empList.add(new Student(2,"Arun", 50));
        empList.add(new Student(3,"Raji",70));

    Student student =empList.stream().max(Comparator.comparingInt(Student::getMark)).get();
    System.out.println(student);
    Student studentmin =empList.stream().min(Comparator.comparingInt(Student::getMark)).get();
    System.out.println(studentmin);
    int sum = empList.stream().mapToInt(Student::getMark).sum();
    System.out.println("Total Sum of Students " +sum);
       
    }
}

class Student {
 
    private Integer Id;
    private String name;
    private Integer mark;
 
    public Student(Integer Id, String name, Integer mark) {
        super();
        this.Id = Id;
        this.name = name;
        this.mark = mark;
    }
 
    @Override
    public String toString() {
 
        return "id: "+ this.Id +" name: "+ this.name +" mark: "+this.mark;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getId() {
        return Id;
    }
 
    public void setId(Integer Id) {
        this.Id = Id;
    }
 
    public Integer getMark() {
        return mark;
    }
 
    public void setMark(Integer mark) {
        this.mark = mark;
    }
}