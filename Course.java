class Details {
    private String courseName;
    private String courseCode;
    private int credits;

   
    public Details(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }
}


public class Course{
    public static void main(String[] args) {
        
        Details course = new Details("Introduction to Java", "CS101", 3);

      
        course.displayDetails();
    }
}