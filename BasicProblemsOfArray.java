/*
    # Reversing An Array
    # Check if a number present in array or not and answer queries corresponding to it 

*/
import arraysutils.SomeArraysMethods;
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
        SomeArraysMethods.printArray(data);
    }


    static void reverseArray(int[] data) {
        int[] ans = new int[data.length];
        int j = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            ans[j++] = data[i];
        }
        System.out.println("After Reversing Array : ");
        SomeArraysMethods.printArray(ans);
    }


    public static void main(String[] args) {
       
        int[] elements = SomeArraysMethods.createArray();
        reverseArray(elements);
        System.out.println("Orignal Array : ");
        SomeArraysMethods.printArray(elements);
        reverseOrignalArray(elements);
    }
}
