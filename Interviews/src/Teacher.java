import java.util.ArrayList;

public class Teacher extends Person implements Abc , BCD{

    /*private String name;
    private String lastName;
    private int age;*/
    static String uni = "My Uni";
    private ArrayList<String> subjects;

    public Teacher(String n , String l , int a){
        super(n,l,a);
        name = n;
        lastName = l;
        age = a;
    }

    public Teacher(String n , String l){
        super(n,l);
        name = n;
        lastName = l;
    }

    public void myFun(){

    }

    public void ft(){
        System.out.println("hello " + name + " " + lastName);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
