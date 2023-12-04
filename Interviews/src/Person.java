public abstract class Person {
    protected String name;
    protected String lastName;
    protected int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
