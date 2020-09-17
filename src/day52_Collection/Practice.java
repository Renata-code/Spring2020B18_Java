package day52_Collection;

import com.sun.source.util.Trees;

import java.util.*;

public class Practice {
    /*
    Tasks:
 1. write a program that can remove the duplicated characters from String and store them into variable

 2. write a program that can identify if two strings are build out of the same letters
 		ex:
 			str1 = "abababa";  //ab ==> ab
 			str2 ="baba";     // ba ==> ab

 			output: true
     */

    public static void main(String[] args) {
        String str = "ABABABCDEF";// ABCDEF
        String[] arr = str.split("");
        str = new LinkedHashSet<>(Arrays.asList(arr)).toString().replace(", ", "");
        System.out.println(str);


    /*
        String str = "ABABABCDEF";// ABCDEF
        String[] arr = str.split("");
        str = "";
         for(  String each  :   new LinkedHashSet<>(Arrays.asList(arr))   ){
             str += each;
         }

        System.out.println(str);
*/


        /*

        String str = "ABABABCDEF";// ["A", "B", "C", 'D', 'E', 'F']
        String[] arr = str.split("");
        LinkedHashSet<String> ls = new LinkedHashSet<>( Arrays.asList(arr) );
        System.out.println( ls );
        //ABCDEF

        String result ="";
        for(String each  : ls  ){
            result += each;
        }

        System.out.println(result);
        */


        System.out.println("============================================");
        /*
        String str1 = "ababababC";
        String str2 = "baba";

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        TreeSet<String> t1 = new TreeSet( Arrays.asList(arr1) );
        TreeSet<String> t2 = new TreeSet( Arrays.asList(arr2) );

        System.out.println(t1);
        System.out.println(t2);

        str1 = t1.toString();
        str2 = t2.toString();

        System.out.println( str1.equals(str2) );

         */

        String str1 = "nurse"; // abC
        String str2 = "serun";  // ab

        str1 = new TreeSet<>( Arrays.asList(str1.split("")) ).toString();
        str2 = new TreeSet<>( Arrays.asList(str2.split("")) ).toString();

        System.out.println(str1.equals(str2));

        String word1 = "abba";
        String word2 = "baba";

        word1 = new TreeSet(Arrays.asList(word1.split(""))).toString();

        word2 = new TreeSet(Arrays.asList(word2.split(""))).toString();

        System.out.println(word1.equalsIgnoreCase(word2));

        
    }





}
