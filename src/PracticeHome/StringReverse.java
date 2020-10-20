package PracticeHome;

public class StringReverse {


    public static void main(String[] args) {

        int[]arr = {4,7,1,9,8,3};

        System.out.println(minNumber(arr));

    }
    public static int minNumber (int[]arr){
        int max = Integer.MIN_VALUE;

        for(int each :arr){
            if(each>max){
                max= each;
            }
        }


        return max;
    }

}