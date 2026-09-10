/*
    # Rotate an array by k steps (along with space optimization approach)
*/

import java.util.Scanner;

import arraysutils.SomeArraysMethods;

public class RotateArray{

    static void rotateArrayByKSteps(int[] data,int k){
        int n=data.length;
        k=k%n;
        int[] ans = new int[data.length];
        int j=0;
        for(int i=(n-k);i<n;i++){
            ans[j++]=data[i];
        }
        for(int i=0;i<(n-k);i++){
            ans[j++]=data[i];
        }
        System.out.println("After rotation : ");
        SomeArraysMethods.printArray(ans);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elements = SomeArraysMethods.createArray();
        System.out.print("Enter the Steps which you want to rotate : ");
        int k = sc.nextInt();
        rotateArrayByKSteps(elements, k);
    }
}