package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    //    public static void main(String[] args) {
//        Color myFaveColor1 = Color.Blue;
//      //  Color myFaveColor2 = Color.Yellow;
//      //  Color myFaveColor3 = Color.White;
//
//        System.out.println( myFaveColor1 );
//
//
//        Browsers browseName = Browsers.Chrome;
//
//        System.out.println(browseName);
//
//        System.out.println();
//
//
//
//
//    }
    public static List<String> NamesN() {


        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Rena", "John", "Heyla"));

        names.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
        return names;

    }


    public static void main(String[] args) {

        List<Integer> numberss = new ArrayList<>(Arrays.asList(7,6,5,4,3,2,1));
        for (int i = 0; i < numberss.size(); i++) {

            for (int j = 0; j < numberss.size(); j++) {

                if (numberss.get(i) < numberss.get(j)) {
                    Integer temp = numberss.get(i);
                    numberss.set(i, numberss.get(j));
                    numberss.set(j, temp);
                }

            }

            System.out.println(numberss);

        }

    }

    public static void Acsending (){

        List<Integer>list = new ArrayList<>(Arrays.asList(6,5,4,3,2,1));







    }
}









