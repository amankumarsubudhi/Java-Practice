// Java Array Program to Remove Duplicate Elements From an Array.

import java.util.HashSet;

public class Java_Practice_18 {

    public static int Duplicate_Remover(int[] arr){

        HashSet<Integer> e = new HashSet<>();
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if (!e.contains(arr[i])) {
                e.add(arr[i]);
                arr[index++] = arr[i];                
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,9,8,4,8,6,14,8,5,6,7,1,77,16};
        int newsize = Duplicate_Remover(arr);
        for(int i=0;i<=newsize;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
