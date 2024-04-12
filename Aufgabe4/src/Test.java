import static org.junit.jupiter.api.Assertions.*;

public class Test {
    public static void main(String[] args) {
        // Create a student management system
        StudentManagementInterface studentManagement = new StudentManagement();

        // Create students
        Student s1 = new Student(123456, "Florian", "Informatik");
        Student s2 = new Student(234567, "Anna", "Physik");
        Student s3 = new Student(345678, "Chris", "Architektur");
        
        // Insert students into the student management system
        studentManagement.insertStudent(s1);
        studentManagement.insertStudent(s2);
        studentManagement.insertStudent(s3);

        // Test countStudents method
        System.out.println("Number of students: " + studentManagement.countStudents()); // Output: 3

        // Test searchStudent method
        Student searchResult1 = studentManagement.searchStudent(234567);
        System.out.println("Search result 1: " + searchResult1); // Output: Matriculation No: 234567, Name: Anna, Course: Physik

        Student searchResult2 = studentManagement.searchStudent(111111);
        System.out.println("Search result 2: " + searchResult2); // Output: null

        // Test isStudent method
        boolean isStudent1 = studentManagement.isStudent(s2);
        System.out.println("Is student 1: " + isStudent1); // Output: true

        boolean isStudent2 = studentManagement.isStudent(new Student(999999, "Dummy", "Dummy"));
        System.out.println("Is student 2: " + isStudent2); // Output: false

        // Test setName and setCourse methods
        s1.setName("Sara");
        s1.setCourse("BWL");
        System.out.println("Updated student 1: " + s1); // Output: Matriculation No: 123456, Name: Sara, Course: BWL

        // Test inserting a student with an existing matriculation number
        Student s4 = new Student(234567, "Adam", "Literaturwissenschaft");
        boolean insertResult = studentManagement.insertStudent(s4);
        System.out.println("Insert result: " + insertResult); // Output: false

        // Test toString method
        System.out.println(studentManagement.toString());
        // Output: Student tree: Matriculation No: 123456, Name: Florian, Course: Informatik
        //          Matriculation No: 234567, Name: Anna, Course: Physik
        //          Matriculation No: 345678, Name: Chris, Course: Architektur
    }
}
