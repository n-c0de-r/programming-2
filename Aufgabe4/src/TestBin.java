import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestBin {
    private StudentManagementInterface studentManagement;
    private Student s1, s2, s3, s4, s5;

    @BeforeEach
    public void setup() {
        // Create a student management system
        studentManagement = new StudentManagement();

        // Create students
        s1 = new Student(123456, "Florian", "Informatik");
        s2 = new Student(234567, "Anna", "Physik");
        s3 = new Student(345678, "Chris", "Architektur");
        s4 = new Student(456789, "Anna", "Jura");
        s5 = new Student(567890, "Florian", "Biologie");

        // Insert students into the student management system
        studentManagement.insertStudent(s1);
        studentManagement.insertStudent(s2);
        studentManagement.insertStudent(s3);
        studentManagement.insertStudent(s4);
        studentManagement.insertStudent(s5);
    }

    @Test
    public void testInsertStudent() {
        boolean insertResult = studentManagement.insertStudent(new Student(678901, "John", "Chemistry"));
        Assertions.assertTrue(insertResult);
        int count = studentManagement.countStudents();
        Assertions.assertEquals(6, count);
    }

    @Test
    public void testCountStudents() {
        int count = studentManagement.countStudents();
        Assertions.assertEquals(5, count);
    }

    @Test
    public void testSearchStudent() {
        Student searchResult1 = studentManagement.searchStudent(234567); // Searching by matriculation number
        Assertions.assertEquals(s2, searchResult1);

//        Student searchResult2 = studentManagement.searchStudent("Anna"); // Searching by name
//        Assertions.assertEquals(s2, searchResult2);
//
//        Student searchResult3 = studentManagement.searchStudent("Florian", "Biologie"); // Searching by name and course
//        Assertions.assertEquals(s5, searchResult3);
//
//        Student searchResult4 = studentManagement.searchStudent("John"); // Searching for non-existing student
//        Assertions.assertNull(searchResult4);
    }

    @Test
    public void testIsStudent() {
        boolean isStudent1 = studentManagement.isStudent(s1);
        Assertions.assertTrue(isStudent1);

        boolean isStudent2 = studentManagement.isStudent(new Student(999999, "Dummy", "Dummy"));
        Assertions.assertFalse(isStudent2);
    }

    @Test
    public void testSettersAndGetters() {
        s1.setName("Sara");
        s1.setCourse("BWL");

        Assertions.assertEquals("Sara", s1.getName());
        Assertions.assertEquals("BWL", s1.getCourse());
    }

//    @Test
//    public void testGetStudentsByCourse() {
//        List<Student> studentsByCourse = studentManagement.getStudentsByCourse("Informatik");
//        Assertions.assertEquals(1, studentsByCourse.size());
//        Assertions.assertEquals(s1, studentsByCourse.get(0));
//
//        List<Student> studentsByCourse2 = studentManagement.getStudentsByCourse("Physik");
//        Assertions.assertEquals(1, studentsByCourse2.size());
//        Assertions.assertEquals(s2, studentsByCourse2.get(0));
//
//        List<Student> studentsByCourse3 = studentManagement.getStudentsByCourse("Jura");
//        Assertions.assertEquals(1, studentsByCourse3.size());
//        Assertions.assertEquals(s4, studentsByCourse3.get(0));
//
//        List<Student> studentsByCourse4 = studentManagement.getStudentsByCourse("Biology");
//        Assertions.assertEquals(0, studentsByCourse4.size());
//    }
}