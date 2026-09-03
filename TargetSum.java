/*
    Target Sum Pattern
    # count the number of pair whose sum is equal to the given target number.
    # count the number of triplet whose sum is equal to the given target number.
*/

import java.util.Scanner;

public class TargetSum {

    static int pairSum(int[] data, int target) {
        int ans = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if ((data[i] + data[j]) == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletSum(int[] data, int target) {
        int ans = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    if ((data[i] + data[j] + data[k]) == target) {
                        ans++;
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size pf array : ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter " + size + " elements of array : ");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        System.out.println("Pair Sum count is : " + pairSum(elements, target));
        System.out.println("Triplet Sum count is : " + tripletSum(elements, target));
    }
}