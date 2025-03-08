// Java Program To Find The Largest Element In The Array Using Sort Function

import java.util.Arrays;

public class Java_Practice_15 {

    public static void main(String[] args) {
        int a[] = {4,6,2,74,58,24,23,33,18,5,6};
        System.out.print("Displaying Elements Of Array = ");
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
        Arrays.sort(a);
        System.out.print("Largest = " + a[a.length - 1]);
    }
    
}
