import java.util.Arrays;

public class ArrayelementTest {

	public static void main(String[] args) {
			
			//testNull
	        byte[] arr = {};
	        //testOneElement
	        byte[] arr1 = {1};
	        //testUniqueElements
	        byte[] arr2 = {1, 2, 3, 4};
	        //testOneMostFrequentElement
	        byte[] arr3 = {1, 2, 2, 3, 3, 3, 4};
	        //testMultipleMostFrequentElements
	        byte[] arr4 = {1, 2, 2, 3, 3, 3, 4, 4};
	        
	        try {
	            System.out.println(Arrays.toString(arr) + " -> " + Arrayelement.haeufigstesElem(arr));
	            System.out.println(Arrays.toString(arr1) + " -> " + Arrayelement.haeufigstesElem(arr1));
	            System.out.println(Arrays.toString(arr2) + " -> " + Arrayelement.haeufigstesElem(arr2));
	            System.out.println(Arrays.toString(arr3) + " -> " + Arrayelement.haeufigstesElem(arr3));
	            System.out.println(Arrays.toString(arr4) + " -> " + Arrayelement.haeufigstesElem(arr4));

	        } 
	        
	        catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException: " + e.getMessage());
	        } 

	        catch (Exception e) {
	            if (e.getMessage().contains("Array is empty")) {
	                System.out.println("Array is empty");
	            } else {
	                System.out.println("Exception occurred: " + e.getMessage());
	            }
	        }
	        
	        System.out.println("Program still continues after catching exceptions");
	        System.out.println(Arrays.toString(arr2) + " -> testUniqueElements: " + Arrayelement.haeufigstesElem((arr2)));
	        System.out.println(Arrays.toString(arr3) + " -> testOneMostFrequentElement: " + Arrayelement.haeufigstesElem(arr3));
	        System.out.println(Arrays.toString(arr4) + " -> testMultipleMostFrequentElements: " + Arrayelement.haeufigstesElem(arr4));
	    }

			
	}
