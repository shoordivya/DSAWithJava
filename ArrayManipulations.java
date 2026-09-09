/*
    Array Manipulation techniques 
    # Find the unique number in a given array where all the elements are being repeated twice with one value being unique.
    # Find the second maximum number in the given array.
    # find the second smallest number in the given array.
    # Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no values is being repeated, return -1.
    # Given an array 'a' consisting of integers. Return the last value that is repeating in this array. If no values is being repeated, return -1.

*/

import arraysutils.SomeArraysMethods;

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
        mx=findMx(data);
        for(int i=0;i<data.length;i++){
            if(data[i]==mx){
                data[i]=Integer.MIN_VALUE;
            }
        }
        secondMax=findMx(data);
        return secondMax;
    }

    static int findMin(int[] data){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<data.length;i++){
            if(data[i]<min){
                min=data[i];
            }
        }
        return min;
    }
    static int secondMin(int[] data){
        int secondMin=0, min=0;
        min=findMin(data);
        for(int i=0;i<data.length;i++){
            if(data[i]==min){
                data[i]=Integer.MAX_VALUE;
            }
        }
        secondMin=findMin(data);
        return secondMin;
    }
    static int firstRepeatedElement(int[] data){
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]==data[j]){
                    return data[i];
                }
            }
        }
        return -1;
    }
    static int lastRepeatedElement(int[] data){
        int ans=-1;
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]==data[j]){
                    ans=data[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] elements = SomeArraysMethods.createArray();
        System.out.println("The unique value among array is "+findUnique(elements.clone()));
        System.out.println("The second Maximum value of array is  "+secondMax(elements.clone()));
        System.out.println("The second minimum value of array is  "+secondMin(elements.clone()));
        System.out.println("The first repeated number in array  "+firstRepeatedElement(elements.clone()));
        System.out.println("The last repeated number in array  "+lastRepeatedElement(elements.clone()));
    }
}
