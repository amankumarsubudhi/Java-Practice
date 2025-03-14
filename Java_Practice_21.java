// Leap Year Program in Java

import java.util.Scanner;

public class Java_Practice_21 {

    public static boolean is_leap_year(int year){

        return (year % 4 == 0) ? true : false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter A Year = ");
        year = sc.nextInt();
        sc.close();
        if(is_leap_year(year))
        {
            System.out.println("It Is A Leap Year");
        }
        else
        {
            System.out.println("It Is Not A Leap Year");
        }
    }
    
}
