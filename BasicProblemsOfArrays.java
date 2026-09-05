/*
    Some Basic Problems of Array Data Structure
    # Swapping Two Numbers
    # Reversing An Array
    # Rotate an array by k steps (along with space optimization approach)
    # Check if a number present in array or not and answer queries corresponding to it 

*/

import java.util.Scanner;

public class BasicProblemsOfArrays{

    static void swapTwoNum(int[] array){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] elements=new int[size];
        System.out.println("Enter "+size+" elements of array :");
        for(int i =0;i<size;i++){
            elements[i]=sc.nextInt();
        }
    }
}