// Write a Program to Find Sum of Fibonacci Series Number

import java.util.Scanner;

public class Java_Practice_8 {

    public static int Fibonacci(int n){
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N = ");
        n = sc.nextInt();
        sum = Fibonacci(n);
        System.out.println("Sum = " + sum);
    }

}
