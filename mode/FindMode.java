/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mode;

/**
 *
 * @author KristaTheCute
 */
public class FindMode {

   /**
    * Prints the mode(s) of the Array. 
    * @param A 
    */
    public static void mode(int[] A) {
        int[] counter = countOccurrences(A); 
        int x = max(counter);
        System.out.println("The mode(s) of this data set are: ");
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == x) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Finds the maximum value in the array Goes through every item in the list
     * so it's linear: O(n)
     *
     * @param A
     * @return max
     */
    public static int max(int[] A) { //Traverses the loop N times
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    /**
     * Determines how many occurrences of each integer is in the array.
     * @param A
     * @return Array holding number of occurrences
     */
    public static int[] countOccurrences(int[] A){
             int[] counter = new int[max(A) + 1];
        for (int i = 0; i < A.length; i++) { //Traverses the loop N times 
            counter[A[i]] += 1;
        }
        return counter; 
    }
}
