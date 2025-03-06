// Write a Java Program to Print Square Hollow Pattern

import java.util.Scanner;

public class Java_Practice_10 {
    public static void Square_Hollow_Pattern(int n){

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i==0 || j==0 || i == n-1 || j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N = ");
        n = sc.nextInt();
        sc.close();
        Square_Hollow_Pattern(n);
    }
    
}
