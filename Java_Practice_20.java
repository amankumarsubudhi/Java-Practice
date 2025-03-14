// Java Program to Find the LCM of Two Numbers.

import java.util.Scanner;

public class Java_Practice_20 {

    public static int LCM(int n1,int n2){

        int ans = (n1>n2) ? n1 : n2;

        while(true)
        {
            if(ans % n1 == 0 && ans % n2 == 0)
            {
                break;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        int result;
        System.out.println("Enter Values To Find The LCM :");
        System.out.print("A = ");
        n1 = sc.nextInt();
        System.out.println("");
        System.out.print("B = ");
        n2 = sc.nextInt();
        sc.close();
        result = LCM(n1,n2);
        System.out.println("LCM Of " +n1+ " And " +n2+ " Is " +result);
    }
    
}
