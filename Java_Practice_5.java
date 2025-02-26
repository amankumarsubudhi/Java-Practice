//Write a Java Program to convert Integer numbers and Binary numbers.

import java.util.Scanner;

public class Java_Practice_5 {
    public static void DectoBin(int d){

        int[] bin = new int[32];
        int i = 0, j;
        while (d > 0) {
            bin[i] = d % 2;
            d/=2;
            i++;
        }

        System.out.print("Binary = ");

        for(j = i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
        
    }

    public static void main(String args[]){
        int decnum,binnum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Decimal Number To Convert It Into Binary Number");

        System.out.print("Decimal = ");
        decnum = sc.nextInt();

        DectoBin(decnum);     


    }
}
