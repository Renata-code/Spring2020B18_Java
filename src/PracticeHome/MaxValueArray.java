package PracticeHome;
import java.util.Arrays;

public class MaxValueArray {

    public static void main(String[] args) {

    }

    public static int arr(int[]max){

        Arrays.sort(max);

        return max[max.length-1];

    }
    public static int MaxValue(int[] max1){

        int max = Integer.MIN_VALUE;
        for (int each : max1 ){

            if(each>max){
                max =each;
            }
        }
        return max;


    }
}
