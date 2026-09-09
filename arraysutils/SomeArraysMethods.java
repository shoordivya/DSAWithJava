package arraysutils;

import java.util.Scanner;

public class SomeArraysMethods {
    
    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter " + size + " Elements of array : ");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        return elements;
    }
    public static void printArray(int[] array){
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
