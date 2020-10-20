package day53_Iterable_Maps;

import java.util.*;

public class Collection_Practice {

    /*
    access-modifiers  specifier  return-type  methodsName(Parameter)
        specifiers: static, final, abstract, synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); // thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // thread-safe

        System.out.println("================================");

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};  //EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
        System.out.println(st);//keeps assertion order and remove dups


       /*
        for(String each: arr){
            st.add(each);
        }
        */

        ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        HashSet<String> st2 = new HashSet<>(arraylist);//doesnt keep assertion and remove dups


        System.out.println(st2);

    }


    public synchronized void append(){

    }


}
