package prototype;

public class Main {
    public static void main(String[] args) {
        Student valodik=new Student("Valodik", "Valodikyan",124,"GG Qshox");
        System.out.println(valodik);

        Student  student=valodik.getClone();
        student.setAge(125);
        student.setFaculty("Turizm");
        student.setName("John");
        student.setSurname("Smith");
        System.out.println(student);

    }
}
