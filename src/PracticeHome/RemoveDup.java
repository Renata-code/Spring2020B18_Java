package PracticeHome;

public class RemoveDup {
    public static void main(String[] args) {

        System.out.println(nonDup("NNHHMMOTTPLOPPP"));
        System.out.println(reverse("Renata"));

    }

    public static String nonDup (String str ){

        String nonDupplicate = "";

        for(int i =0;i<str.length();i++){
            if(!nonDupplicate.contains(""+str.charAt(i))){
                nonDupplicate+=str.charAt(i);
            }
        }

        return nonDupplicate;
    }

    public static String reverse (String str){

        String reversed ="";

        for(int i = str.length()-1; i >=0;i--){

            reversed+=str.charAt(i);

        }
        return reversed;
    }
}
