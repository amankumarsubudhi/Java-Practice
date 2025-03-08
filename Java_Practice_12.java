// Write a Java Program to Compute the Sum of Array Elements.




public class Java_Practice_12 {

    public static void DisplayArray(int[] a){

        int A_L;
        A_L = a.length;

        for(int i=0;i<A_L;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
    }

    public static int SumOfArray(int[] a){
        int sum = 0,A_L;
        A_L = a.length;
        for(int i=0;i<A_L;i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {22,54,66,76,83,88};
        System.out.print("Displaying All The Elements In The Array = ");
        DisplayArray(a);
        int sum = SumOfArray(a);
        System.out.println("Sum Of Array Elements = " + sum);
    }
    
}
