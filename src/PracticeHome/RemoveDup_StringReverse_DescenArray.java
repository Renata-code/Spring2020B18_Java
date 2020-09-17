package PracticeHome;

import javax.xml.ws.Response;
import java.util.Arrays;

public class RemoveDup_StringReverse_DescenArray {

    public static void main(String[] args) {

        System.out.println(reverse("Renata" ));
        System.out.println(removeDup("AAAAABBBBBPPPPPOOOOOLLLUUUCCCKK"));
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr2)));

        int[]arr3 = {4,5,6,7,8};
        System.out.println(Arrays.toString(reverseArray2(arr3)));

    }

    public static String reverse(String str) {

        String reverseName = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseName += str.charAt(i);

        }
        return reverseName;

    }

    public static String removeDup(String str2){

        String noDupWord = "";

        for(int i = 0;i<=str2.length()-1;i++){
            if(!noDupWord.contains(""+str2.charAt(i))){
                noDupWord+=str2.charAt(i);
            }
        }
        return  noDupWord;
    }


    public static int[] reverseArray (int[]arr){

        int [] RevArray = new int[arr.length];

        int j = arr.length-1;
        for (int i = 0; i < arr.length ; i++) {

            RevArray[i] = arr[j];
            j--;

        }

        return RevArray;
    }

    public static int[] reverseArray2(int [] arr2 ){

        int[]RevArray2 = new int[arr2.length];

        int j = arr2.length-1;

        for (int i = 0; i < arr2.length; i++) {

            RevArray2[i] = arr2[j];
            j--;
        }
        return RevArray2;

    }





























}