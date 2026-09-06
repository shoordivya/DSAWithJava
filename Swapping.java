/*
    Some Basic Problems of Array Data Structure
    # Swapping Two Numbers
    

*/

import java.util.Scanner;

public class Swapping{

    static void swapWithTemp(int a,int b){
        int temp=0;
        System.out.println("Before swapping a and b's value is : "+a+", "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a and b's value is : "+a+", "+b);
    }

    static void swapWithoutTemp(int a,int b){
        System.out.println("Before swapping a and b's value is : "+a+", "+b);//a=5,b=3
        a=a+b;   //5+3=8
        b=a-b;   //8-3=5
        a=a-b;      //a-b;
        System.out.println("After swapping a and b's value is : "+a+", "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Using Temp Variable ");
        swapWithTemp(a, b);
        System.out.println("Without Using Temp Variable ");
        swapWithoutTemp(a, b);

    }
}