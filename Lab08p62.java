/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08p6.pkg2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab08p62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            array[i] = input.nextInt();
        }
        input.close();
        System.out.printf("Array after input: %s\n",Arrays.toString(array));
        
        swapFirstAndLastElement(array);
        System.out.printf("Swapped first and last element: %s\n", Arrays.toString(array));
        
        shiftAllElements(array);
        System.out.printf("Shifted elements: %s\n", Arrays.toString(array));
        
        replaceAllEvenElements(array);
        System.out.printf("Replaced even elements: %s\n", Arrays.toString(array));
        
        replaceWithNeighbours(array);
        System.out.printf("Replace elements with their neighbours: %s\n", Arrays.toString(array));
        
        int[] newArray = removeMiddleElement(array);
        System.out.printf("Removed middle elements: %s\n", Arrays.toString(newArray));
        
        moveEvenElementsToTheFront(array);
        System.out.printf("Moved even elements to the front: %s\n", Arrays.toString(array));
        
        int secondLargest = secondLargestElement(array);
        System.out.printf("Largest element is: %d\n", secondLargest);
        
        boolean isIncreasing = isArrayIncreasingOrder(array);
        System.out.printf("The sequence is increasing? %s\n", isIncreasing);
        
        boolean isAdjacentDuplicates = adjacentDuplicateElements(array);
        System.out.printf("The sequence contains adjacent duplicates? %s\n", isAdjacentDuplicates);
        
        boolean isContainDuplicates = containDuplicateElements(array);
        System.out.printf("The sequence contains duplicates? %s\n", isContainDuplicates);
    }

    public static void swapFirstAndLastElement(int[] array) {
        int temporaryVariable = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temporaryVariable;
    }

    public static void shiftAllElements(int[] array) {
        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

    public static void replaceAllEvenElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    public static void replaceWithNeighbours(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int larger = array[i - 1];

            if (larger < array[i + 1]) {
                larger = array[i + 1];
            }

            array[i] = larger;
        }
    }

    public static int[] removeMiddleElement(int[] array) {
        int firstMiddleIndex = (array.length / 2) - 1;

        if (array.length % 2 == 0) {
            int[] newArray = new int[array.length - 2];

            for (int i = 0; i < firstMiddleIndex; i++) {
                newArray[i] = array[i];
            }

            for (int i = firstMiddleIndex; i < newArray.length; i++) {
                newArray[i] = array[i + 2];
            }

            return newArray;
        } else {
            int[] newArray = new int[array.length - 1];

            for (int i = 0; i <= firstMiddleIndex; i++) {
                newArray[i] = array[i];
            }

            for (int i = firstMiddleIndex + 1; i < newArray.length; i++) {
                newArray[i] = array[i + 1];
            }

            return newArray;
        }
    }

    public static void moveEvenElementsToTheFront(int[] array) {
        int lastEvenElementIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temporaryVariable = array[i];
                array[i] = array[lastEvenElementIndex];
                array[lastEvenElementIndex] = temporaryVariable;
                lastEvenElementIndex++;
            }
        }
    }

    public static int secondLargestElement(int[] array) {
        int firstLargestElement = array[0];
        int secondLargestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstLargestElement) {
                secondLargestElement = firstLargestElement;
                firstLargestElement = array[i];
            }
        }

        return secondLargestElement;
    }

    public static boolean isArrayIncreasingOrder(int[] array) {
        int currentElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (currentElement > array[i]) {
                return false;
            }

            currentElement = array[i];
        }

        return true;
    }

    public static boolean adjacentDuplicateElements(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static boolean containDuplicateElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
    }
    
}
