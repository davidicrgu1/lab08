/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08p6011;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab08p6011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            firstArray[i] = input.nextInt();
        }

        int[] secondArray = new int[5];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("%d element of array: ", i + 1);
            secondArray[i] = input.nextInt();
        }

        input.close();

        boolean isSameElements = sameElements(firstArray, secondArray);
        System.out.printf("Are same elements? %s", isSameElements);
    }

    public static boolean sameElements(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];

            int firstArrayOccurrences = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == currentElement) {
                    firstArrayOccurrences++;
                }
            }

            int secondArrayOccurences = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j] == currentElement) {
                    secondArrayOccurences++;
                }
            }

            if (firstArrayOccurrences != secondArrayOccurences) {
                return false;
            }
        }

        return true;
    }
}
 
