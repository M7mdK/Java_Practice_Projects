public class Student {
    private String name;
    private int mark;

    public Student(String name , int mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMark(){
        return mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    @Override
    public String toString(){
        return name + " : " + mark;
    }
}
