/*
    # Reversing An Array
    # Rotate an array by k steps (along with space optimization approach)
    # Check if a number present in array or not and answer queries corresponding to it 

*/

import java.util.Scanner;
public class BasicProblemsOfArray {

    static void reverseOrignalArray(int[] data) {
        int j = 0, i = data.length - 1;
        while (i > j) {
            int temp = data[j];
            data[j] = data[i];
            data[i] = temp;
            i--;
            j++;
        }
        System.out.println("After Reversing Array : ");
        printArray(data);
    }

    static void printArray(int[] data) {

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] data) {
        int size = data.length;
        int[] ans = new int[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            ans[j++] = data[i];
        }
        System.out.println("After Reversing Array : ");
        printArray(ans);
    }

    static void rotateArrayByKSteps(int[] data,int k){
        int size=data.length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter " + size + " elements of array :");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        reverseArray(elements);
        System.out.println("Orignal Array : ");
        printArray(elements);
        reverseOrignalArray(elements);
    }
}
