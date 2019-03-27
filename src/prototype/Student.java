package prototype;

public class Student implements Prototype {

    private String name;
    private String surname;
    private int age;
    private String faculty;


    public Student() {
    }

    public Student(String name, String surname, int age, String faculty) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.faculty = faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public Student getClone() {
        return new Student();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
