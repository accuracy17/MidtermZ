package problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String [] split_str = st.split(" "); // splitting string in word.
        Map<String,Integer> myMap = new HashMap<String, Integer>();
        for (String str : split_str ){
            if(myMap.get(str)!=null){
                myMap.put(str,myMap.get(str)+1);
            }
            else {
                myMap.put(str,1);
            }
        }
        Set<String> str1= myMap.keySet();
        for(String s : str1){
            System.out.println(s+ " : Repeated "+myMap.get(s)+" time/s.");
        }
    }
}