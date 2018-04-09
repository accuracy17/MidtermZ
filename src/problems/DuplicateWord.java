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
        String rp = "Will you, William? Can't you, don't you, won't you, William?";

        String [] split_rep = rp.split(" ");
        Map<String,Integer> myMap = new HashMap<String, Integer>();
        for (String rep : split_rep ){
            if(myMap.get(rep)!=null){
                myMap.put(rep,myMap.get(rep)+1);
            }
            else {
                myMap.put(rep,1);
            }
        }
        Set<String> rep1= myMap.keySet();
        for(String r : rep1){
            System.out.println(r+ " : Repeated "+myMap.get(r)+" time/s.");
        }
    }
}