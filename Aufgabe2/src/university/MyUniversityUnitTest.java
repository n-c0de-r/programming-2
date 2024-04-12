package university;

import static org.junit.Assert.fail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class is the unit test class. 
 * It contains 6 test cases of the sortList method (3 normal cases and 3 borderline ca.ses)
 * and additional test cases of other methods implemented in "Administration" class
 * 
 * @author Tomas Proano (s0589661)
 * @version 1.0
 * 
 * Programmierung 2 (PCÜ) Pflichtaufgabe Nr. 2 
 * Dozentin: Prof. Dr. Adrianna Alexander 
 * Tutor: Ole Gordieck
 */

class MyUniversityUnitTest {

    private Administration administration;
    private Administration administration1;
    private Administration administration2;
    private Administration administration3;
    private Administration administration4;
    private Administration administration5;

    @BeforeEach
    public void setup() {
        // Create instances of Administration for testing purposes
        Person p1 = new Student("Anna", 'f', 123400);
        Person p2 = new Student("Sara", 'f', 123401);
        Person p3 = new Docent("Gabriel", 'm', 1);
        Person p4 = new Docent("Lisa", 'f', 2);
        Person p5 = new Student("Mario", 'm', 123402);
        Person p6 = new Student("Chris", 'd', 123403);
        Person p7 = new Student("Eleftherios", 'm', 123404);
        Person p8 = new Student("Anna", 'f', 123405);
        
        administration = new Administration(p1, p2, p3, p4, p5, p6);
        administration1 = new Administration(p7);
        administration2 = new Administration(p1, p5);
        administration3 = new Administration();
        administration4 = new Administration(p1, p7, p8);
        
    }

    @Test
 // Normal case: Unsorted list has to be sorted
    public void testSortList_normalCase() {
        
        Person[] sortList = administration.sortList();

        // Assert that the sorted list is in alphabetical order by name
        assertEquals("Anna", sortList[0].getName());
        assertEquals("Chris", sortList[1].getName());
        assertEquals("Gabriel", sortList[2].getName());
        assertEquals("Lisa", sortList[3].getName());
        assertEquals("Mario", sortList[4].getName());
        assertEquals("Sara", sortList[5].getName());

    }
    
    @Test
   // Normal case: List is already sorted
   public void testSortList_alreadySorted() {
   	 Person[] sortList = administration2.sortList();
   	 
   	 assertEquals("Anna", sortList[0].getName());
   	 assertEquals("Mario", sortList[1].getName());
   	 
   }
    
    @Test
   // Normal case: List has two persons with the same name
   public void testSortList_duplicateNames() {
   	 Person[] sortList = administration4.sortList();
   	 
   	 assertEquals("Anna", sortList[0].getName());
   	 assertEquals("Anna", sortList[1].getName());
   	 assertEquals("Eleftherios", sortList[2].getName());
   	 
   	 
   }
    
    @Test
    // Borderline case: The list has only one person
    public void testSortList_containsOneElement() {
        Person[] sortList = administration1.sortList();

        // Assert that the sorted list is in alphabetical order by name
        assertEquals("Eleftherios", sortList[0].getName());

    }

    @Test
    // Borderline case: Empty list
    public void testSortList_emptyArray() {
    	
    	try {
    	Person[] sortList = administration3.sortList();
    	// Should be 0
    	assertEquals(0, sortList.length);
    	} 	catch (IllegalStateException e){
    	// Exception gets thrown and caught. Test passes
    	}
    	
    }
    
    @Test
    // Borderline case: personList is null
 public void testSortList_personListIsNull() {
    	// Passing null as the personList
     administration5 = new Administration((Person[]) null); 

     try {
         administration5.sortList(); // This should throw a NullPointerException
         fail("Expected NullPointerException was not thrown");
     } catch (NullPointerException e) {
    // Exception gets thrown and caught. Test passes
     }
 }
    
    
    //Additional tests of other methods:

    @Test
    public void testCountFemale_normalCase() {
        // Count female students in the list
        int femaleCount = administration.countFemale();

        // Should be 2
        assertEquals(2, femaleCount);
    }

    @Test
    public void testGetDocents_normalCase() {
        // Give back docents of department number 2
        Docent[] docents = administration.getDocents(2);

        // This should be displayed
        assertEquals(1, docents.length);
        assertEquals("Lisa", docents[0].getName());
        assertEquals(2, docents[0].getDepartment());
    }

    @Test
    public void printList_normalCase() {
        // Get the string representation of the persons' list
        String listString = administration.toString();

        // Evaluate that the generated string contains the names of all persons
        assertTrue(listString.contains("Anna"));
        assertTrue(listString.contains("Chris"));
        assertTrue(listString.contains("Gabriel"));
        assertTrue(listString.contains("Lisa"));
        assertTrue(listString.contains("Mario"));
        assertTrue(listString.contains("Sara"));
    }
   
}