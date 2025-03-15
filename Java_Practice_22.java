// Java Program To Check Whether Input Character Is A Vowel Or Consonant 

import java.util.Scanner;

public class Java_Practice_22 {

    public static void Vowel_Or_Consonant(char w){
        char nw = Character.toLowerCase(w);
        if(nw == 'a' || nw == 'e' || nw == 'i' || nw == 'o' || nw == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char w;
        System.out.print("Enter A Character : ");
        w = sc.next().charAt(0);
        sc.close();
        Vowel_Or_Consonant(w);
    }
    
}
