// Java Array Program For Array Rotation.

import java.util.Scanner;

public class Java_Practice_17 {
    
    public static void Rotate(int[] aa,int d,int n){

        int[] temp = new int[n];

        int k = 0;

        for(int i = d;i<n;i++)
        {
            temp[k] = aa[i];
            k++;
        }

        for(int i = 0;i<d;i++)
        {
            temp[k] = aa[i];
            k++;
        }

        for(int i=0;i<n;i++)
        {
            aa[i] = temp[i];
        }

    }

    public static void Print(int[] aa,int n){

        for(int i=0;i<n;i++)
        {
            System.out.print(aa[i] + " ");
        }

    }



    public static void main(String[] args) {
        int[] aa = {2,4,6,8,10,12,14,16};
        int n = aa.length;
        Print(aa,n);
        System.out.println("");
        System.out.print("From Which Position You Want To Rotate The Array = ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.close();
        Rotate(aa,d,n);
        Print(aa, n);
    }


}
