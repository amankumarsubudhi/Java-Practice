////Write a Program to Swap Two Numbers Using Array Which Return Two Values From A Function

import java.util.Scanner;

public class Java_Practice_4 {
    
    public static int[] swap(int p, int q){

        int temp = p;
        p = q;
        q = temp;

        return new int[]{p,q};        

    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number To Swap");
        System.out.print("A = ");
        a = sc.nextInt();
        System.out.print("B = ");
        b = sc.nextInt();

        System.out.println("Before Swapping Value Of A and B");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        int[] swapped = swap(a,b);

        System.out.println("After Swapping Value Of A And B");
        System.out.println("A = "+swapped[0]);
        System.out.println("B = "+swapped[1]);


    }


}
