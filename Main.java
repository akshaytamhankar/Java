
class Student {
    
    private String name;
    private int age;
    private String studentId;

    
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}


public class Main {
    public static void main(String[] args) {
      
        Student student = new Student("akshay", 21, "S12345");

       
        student.displayDetails();
    }
}
