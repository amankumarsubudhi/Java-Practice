//Write a Program to Find Factorial of a Number in Java.

import java.util.Scanner;

public class Java_Practice_6 {

    public static int Factorial(int n){
        int fact=1;
        while(n>=1){
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number = ");
        num = sc.nextInt();
        sc.close();
        result = Factorial(num);
        System.out.println("Factorial = " + result);
    }
    
}
