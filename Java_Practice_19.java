// Java Array Program to Remove All Occurrences of an Element in an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java_Practice_19 {

    public static void PrintArray(Integer[] arr, int l) {

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static Integer[] RemoveElementUsingArrayList(Integer[] arr, int k) {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.removeAll(Arrays.asList(k));

        Integer[] newArr = list.toArray(new Integer[0]);

        return newArr;

    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 4, 6, 8, 1, 2, 7, 6, 4, 9, 8, 3, 5, 4 };
        Scanner sc = new Scanner(System.in);
        PrintArray(arr, arr.length);
        System.out.print("Enter The Number To Remove It's All Occurrences = ");
        int k = sc.nextInt();
        sc.close();
        Integer[] retunedArray = RemoveElementUsingArrayList(arr, k);
        System.out.println(Arrays.toString(retunedArray));
    }

}
