import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("lihua", 18, "man", "123456798");
        System.out.println("name: " + student.getName());
        System.out.println("age: " + student.getAge());
        System.out.println("gender: " + student.getGender());
        System.out.println("ID: " + student.getID());
    }
}
