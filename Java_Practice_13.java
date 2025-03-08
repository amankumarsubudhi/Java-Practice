// Write a Java Program to Find the Largest Element in Array.



public class Java_Practice_13 {

    public static int largest(int a[]){
        int max = a[0];
        for(int i = 0;i < a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int a[] = {8,4,88,6,99,152,2};
        int max = largest(a);
        System.out.println("Largest Number In The Array = " + max);
    }
    
}
