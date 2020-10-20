package Resources;


import day33_CustomClass.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        //String unique = "";
        String str = "AAAABBBBTTTTNMMMM";

        Map<Character,Integer> unique = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            int count =0;
            for (int j = 0; j <str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }

                if(count==1){
                    unique.put(str.charAt(i),count);
                }
            }
        }
        System.out.println(unique);

        int arr[] = {4,2,7,6,9,8,70};
        System.out.println(finmin(arr));
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

    }
    public static int finmin (int []number){

        int max = Integer.MIN_VALUE;//{4,6,3,8,10}
        for (int each : number){

            if(each>max){
                max=each;
            }

        }
        return max;


    }
    public static int findMax(int []num){

        Arrays.sort(num);
        return num[num.length-1];
    }

    public static int findMin(int []num){

        Arrays.sort(num);
        return num[num[0]];
    }
}
