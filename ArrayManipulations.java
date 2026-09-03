/*
    Array Manipulation techniques 
    # Find the unique number in a given array where all the elements are being repeated twice with one value being unique.
    # Find the second maximum number in the given array.
    # find the second smallest number in the given array.
    # Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no values is being repeated, return -1.
    # Given an array 'a' consisting of integers. Return the last value that is repeating in this array. If no values is being repeated, return -1.

*/
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {
    
    static int findUnique(int[] data){
        int ans=0;
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]==data[j]){
                    data[i]=-1;
                    data[j]=-1;
                }
            }
        }
        for(int i=0;i<data.length;i++){
            if(data[i]>0){
                ans=data[i];
            }
        }
        return ans;
    }
    static int findMx(int[] data){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }
    static int secondMax(int[] data){
        int secondMax=0, mx=0;
        mx=Arrays.
        for(int i=0;i<data.length;i++){
            if(data[i]==mx){
                data[i]=Integer.MIN_VALUE;
            }
            System.out.println(data[i]);
        }
        System.out.println(Arrays.toString(data));
        secondMax=findMx(data);
        System.out.println(secondMax);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter "+size+" elements for array : ");
        for(int i=0;i<elements.length;i++){
            elements[i]=sc.nextInt();
        }
        System.out.println("The unique value among array is "+findUnique(elements));
        System.out.println("The second Maximum value of array is  "+secondMax(elements));
    }
}
