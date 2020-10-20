package PracticeHome;

import java.util.Arrays;
import java.util.TreeSet;

public class passValidation {

    public static boolean PassWordValidation(String Password){

        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";



        boolean HasLower =Password.matches(lowercase),
                HasUpper = Password.matches(uppercase);
        return true;

    }
    public static int[] concate2Arrays(int[]arr1,int[]arr2){

        int []result = new int[arr1.length+arr2.length];

        return result;
    }


    public static int reverse(int n) {
        int num;
        String result = "";
        num = n * (-1);
        while (num > 0) {
            int temp = num % 10;
            result += temp;
            num = num / 10;
        }
        int result2 = Integer.parseInt(result);
        result2 = result2 * (-1);
        return result2;
    }

    public static Boolean sameLetters(){


        String word1 = "Nursed".toLowerCase();
        String word2 = "SuRden".toLowerCase();


        word1 = new TreeSet(Arrays.asList(word1.split(""))).toString();

        word2 = new TreeSet(Arrays.asList(word2.split(""))).toString();

        return word1.equals(word2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters());
        System.out.println(reversedMyName("Aizhan"));

    }

    public static String reversedMyName(String str){

        String reversed ="";

        for (int i = str.length()-1;i>=0;i--) {

            reversed+=str.charAt(i);

        }
        return reversed;

    }
}
