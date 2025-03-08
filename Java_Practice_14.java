// Java Program to Find the Largest Element in Array using Java Stream.

import java.util.Arrays;

public class Java_Practice_14 {
    public static void main(String[] args) {
        int[] a = {44,55,97,6,2,264,87,14,9,7,88,848};
        System.out.print("Displaying The Array Elements =");
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Largest Number In The Array = " + max);
    }
}
