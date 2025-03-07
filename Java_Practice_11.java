// Write A Java Program To Print Diamond Star Pattern

import java.util.Scanner;

public class Java_Practice_11 {

    public static void Diamond_Star_Pattern(int n){

        int i,j;    

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
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
        Diamond_Star_Pattern(n);
    }
    
}
