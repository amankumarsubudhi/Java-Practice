// Write a Program to Print Pyramid Number Pattern in Java.

import java.util.Scanner;

public class Java_Practice_9 {
    public static void Pyramid_Pattern(int n){

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=(2 * i - 1);k++)
            {
                System.out.print("*");
            }
           System.out.println();
        }

    }



    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value Of N = ");
        n = sc.nextInt();
        sc.close();

        Pyramid_Pattern(n);
    }
}
