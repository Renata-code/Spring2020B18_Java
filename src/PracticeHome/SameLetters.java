package PracticeHome;

import java.util.*;

public class SameLetters {

    public static void main(String[] args) {

        Map<String,Integer>data  = new HashMap<>();

        data.put("England",67);
        data.put("Germany",32);
        data.put("Norway",23);
        data.put("USA",12);


        System.out.println(minValue(data));
    }


    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first();// use last if we are looking for the max value

    }

}

