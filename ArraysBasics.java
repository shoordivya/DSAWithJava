
/*
    In this we understand some basic operations with arrays.
    # Calculate the Sum of the all the elements in the given Array.
    #Calculate the maximum value out of all the elements in the array.
    #Search the given element x in array. If present then return the index else return -1.
    #Count the number of occurance of a particular element x.
    #Find the last occurance of an element in array and return the index.
    #Check if the given array is sorted or not.

*/
import java.util.Scanner;

public class ArraysBasics {

    private void sumOfAllElements(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("SUM : " + sum);
    }

    private void maxElement(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("Max element of Array : " + max);
    }

    private int findElement(int[] data, int ele) {
        for (int idx = 0; idx < data.length; idx++) {
            if (ele == data[idx]) {
                return idx;
            }
        }
        return -1;
    }

    private void countOccurance(int[] data, int ele) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == ele) {
                count++;
            }
        }
        System.out.println(ele + " is occured " + count + " times in Array.");
    }

    private void lastOccurance(int[] data, int ele) {
        int idx = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == ele) {
                idx = i;
            }
        }
        System.out.println("Last Occurance of " + ele + " is at " + idx);
    }

    private boolean isSorted(int[] data) {
        // boolean result=true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArraysBasics obj = new ArraysBasics();
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter " + size + " Elements of array : ");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        obj.sumOfAllElements(elements);
        obj.maxElement(elements);
        System.out.print("Enter element which you want to search : ");
        int element = sc.nextInt();
        int result = obj.findElement(elements, element);
        if (result == -1) {
            System.out.println(element + " is not present");
        } else {
            System.out.println(element + " is present");
            obj.countOccurance(elements, element);
            obj.lastOccurance(elements, element);
        }

        System.out.println("Array is Sorted : " + obj.isSorted(elements));
    }
}