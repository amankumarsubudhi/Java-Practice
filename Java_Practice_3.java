//Write a Program to Swap Two Numbers

import java.util.Scanner;

public class Java_Practice_3 {
    
    public static void Swap(int p , int q){

        int temp =p;

        p = q;
        q = temp;
        System.out.println("After Swapping Value Of A And B");
        System.out.println("A = "+p);
        System.out.println("B = "+q);

    }

    public static void main(String[] args) {
        
        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Swapping Of Two Numbers");
        System.out.print("Enter The Value Of A = ");

        a = sc.nextInt();
        
        System.out.print("Enter The Value Of B = ");

        b = sc.nextInt();

        System.out.println("Before Swapping Value Of A And B");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        Swap(a,b);


    }


}
