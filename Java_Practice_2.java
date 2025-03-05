//Write a Program in Java to Add two Numbers.

import java.util.Scanner;

public class Java_Practice_2 {
    public static int add(int a,int b){
        return (a+b);
    }

    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers To Add Their Values");
        System.out.print("Enter The Value Of A = ");

        a = sc.nextInt();

        System.out.print("Enter The Value Of B = ");

        b = sc.nextInt();
        sc.close();

        System.out.println("Addition Is = "+add(a,b));

    }
}
