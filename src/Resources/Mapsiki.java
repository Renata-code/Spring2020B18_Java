package Resources;

import java.util.*;

public class Mapsiki {

    public static Map<String,Integer> sortByValues (Map<String,Integer>map){

        List<Map.Entry<String,Integer>> list  = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> each:list){

            map.put(each.getKey(),each.getValue());
        }
        return map;
    }

    public static void main(String[] args) {

        Map<String,Integer> mapsiki = new LinkedHashMap<>();

        mapsiki.put("House",103);
        mapsiki.put("Cottage",100);
        mapsiki.put("Bungalo",200);

        System.out.println(sortByValues(mapsiki));
        System.out.println(minValue(mapsiki));


    }

    public static int fibonachi(int num){
        int result =0;
        int a =0;
        int b =0;

        for (int i = 1; i <num ; i++) {

            result = a+b;
            b=a;
            b=result;

        }
        return result;
    }

    public static int minValue (Map<String,Integer> map){

        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first();


    }
    public static void solution(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            if(i %2 ==0 && i%3 == 0 && i %5==0)
                result += "CodilityTestCoders\n";
            else if(i %2 ==0 && i%3 == 0)
                result += "CodilityTest\n";
            else if(i % 2==0 && i %5==0)
                result += "CodilityCoders\n";
            else if(i % 3 == 0 && i % 5 ==0)
                result +="TestCoders\n";
            else if(i % 2 ==0)
                result += "Codility\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Test\n";
            else
                result += i + "\n";

        }



        System.out.println(result);

    }
}
