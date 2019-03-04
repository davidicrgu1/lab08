/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d element of array: ", i);
            array[i] = input.nextInt();
        }
        input.close();

        evenIndexElements(array);
        everyEvenElement(array);
        allElementsInReverseOrder(array);
        firstAndLastElement(array);
    }

    public static void evenIndexElements(int[] array) {
        System.out.print("Even index elements are: ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }

    public static void everyEvenElement(int[] array) {
        System.out.print("Every even element: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }

    public static void allElementsInReverseOrder(int[] array) {
        System.out.print("All elements in reverse order: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void firstAndLastElement(int[] array) {
        System.out.print("First and last elements are: ");
        System.out.print(array[0] + " " + array[array.length - 1]);
        System.out.println();
    }
}
  
