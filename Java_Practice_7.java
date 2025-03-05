//Write a Program to Calculate Simple Interest in Java

import java.util.Scanner;

public class Java_Practice_7 {

    public static float si(int p,int t,float r){

        float si = ((p*t*r) / 100);

        return si;
    }

    public static void main(String[] args) {
        int p,t;
        float r,si;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Principal Amount = ");
        p = sc.nextInt();

        System.out.print("Enter The Rate Of Interest = ");
        r = sc.nextInt();

        System.out.print("Enter The Time Period (In Months) = ");
        t = sc.nextInt();
        sc.close();

        si = si(p,t,r);

        System.out.println("Simple Interest = " + si);

    }
    
}
