package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Principal");
        map.put(2, "Teacher");
        map.put(3, "Security");

        System.out.println(map.get(1));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        List<String> PrincipalDuties = new ArrayList<>();
        PrincipalDuties.add("Lead the whole staff");
        PrincipalDuties.add("Supervises");
        PrincipalDuties.add("Annoucements");

        List<String> TeacherDuties = new ArrayList<>();
        TeacherDuties.add("Paper work");
        TeacherDuties.add("Makes quizes");
        TeacherDuties.add("Workshops");

        List<String> SecurityDuties = new ArrayList<>();
        SecurityDuties.add("Check cameras");
        SecurityDuties.add("Greets");
        SecurityDuties.add("Keep safe");

        Map<String, List<String>> newMap = new LinkedHashMap<String, List<String>>();
        newMap.put("Principal", PrincipalDuties);
        newMap.put("Teacher", TeacherDuties);
        newMap.put("Security", SecurityDuties);

        for (Map.Entry entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}