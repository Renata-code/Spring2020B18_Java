package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {

    public static void main(String[] args) {
        // 1. sort the array in ascedning
        // 2. reverse the array that's sorted in ascending  ==> descending

        int[] arr = {10, 78, 2, -1, 500, 70};
        int[] arr1 = {12, 68, 20, -10, 501, 71};
        Arrays.sort(arr); // sorts in ascending
        Arrays.sort(arr1);

        // System.out.println( Arrays.toString(arr) );

        int[] RevArr = new int[arr.length];

        int j = arr.length -1;
        for(int i =0; i <= arr.length-1; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        System.out.println( Arrays.toString(RevArr));
        System.out.println(Arrays.toString(reverse(arr1)));

    }
        public static int[]reverse(int[]arr){

        int[]reverseArray = new int[arr.length];


        int j = arr.length-1;
        for (int i = 0; i < arr.length-1 ; i++) {
            reverseArray[i] = arr[j];
            j--;

        }
        return reverseArray;
    }

}
