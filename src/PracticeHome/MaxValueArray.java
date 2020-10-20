package PracticeHome;
import java.util.Arrays;

public class MaxValueArray {

    public static void main(String[] args) {

        int[] num = {2,1,5,4};

        System.out.println(MaxValue(num));

    }

    public static int arr(int[]max){  //

        Arrays.sort(max);

        return max[max.length-1];

    }
    public static int MaxValue(int[] max1){//int[] num = {2,1,5,4};

        int max = Integer.MAX_VALUE;  // max =-20000000000
        for (int each : max1 ){

            if(each<max){ //5
                max =each;
            }
        }
        return max;

    }
}
