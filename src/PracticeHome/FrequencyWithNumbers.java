package PracticeHome;

public class FrequencyWithNumbers {

    public static void main(String[] args) {

        System.out.println(getWord("PPPPKKKKNNNDDDLLLLLLT"));
    }

    public static String getWord(String word){

        int count =1;
        String retResult= "";
        for (int i = 0;i < word.length()-1;i++) {
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
                continue;
            }else{
                retResult=retResult+word.charAt(i)+count;
            }
            count=1;
        }
        retResult=retResult+word.charAt(word.length()-1);
        return retResult;
    }




}
