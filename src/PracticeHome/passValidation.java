package PracticeHome;

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
}
