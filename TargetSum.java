/*
    Target Sum Pattern
    # count the number of pair whose sum is equal to the given target number.
    # count the number of triplet whose sum is equal to the given target number.
*/

import java.util.Scanner;

public class TargetSum{

    static int pairSum(int[] data,int target){
        int ans=0;


        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size pf array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter "+size+" elements of array : " );
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target=sc.nextInt();
        System.out.println("Pair Sum count is : "+ pairSum(elements,target));
    }
}