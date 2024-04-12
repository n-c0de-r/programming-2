import java.util.Arrays;

//This method uses the following approach:
//
//1. Sort the input array using Arrays.sort() method. This groups identical elements together.
//2. Traverse the sorted array linearly and keep track of the most frequent element and its count.
//3. Once we find a new element with a higher count, update the most frequent element and count.
//4. After the traversal, create a new result array of the maxCount size and fill it with the most frequent element.
//5. Return the result array.

//1.5 Häufigstes Element im Array suchen
public class Arrayelement {
    public static byte[] haeufigstesElem(byte[] arr) {
    	
        Arrays.sort(arr); // sort the array to group identical elements together
        
        byte mostFrequent = arr[0]; // assume the first element is the most frequent
        int maxCount = 1; // count of the most frequent element
        int currentCount = 1; // count of the current element
        
        for (int i = 1; i < arr.length; i++) {
          
        	if (arr[i] == arr[i-1]) { // the current element equals the previous one
                currentCount++;
            } else { // the current element is different from the previous one
                if (currentCount > maxCount) { // we found a new most frequent element
                    mostFrequent = arr[i-1];
                    maxCount = currentCount;
                }
                currentCount = 1; // reset the count for the new element
            }
        }
        if (currentCount > maxCount) { // handle the last element
            mostFrequent = arr[arr.length-1];
            maxCount = currentCount;
        }
        byte[] result = new byte[maxCount];
       
        Arrays.fill(result, mostFrequent); // fill the result array with the most frequent element
        return result;
    }
}