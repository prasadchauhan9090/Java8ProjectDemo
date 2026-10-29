package sortmap.lambda.com;

import java.util.*;

public class SortedMap {


    public static void main(String args[]) throws Exception
    {

        Map<String , Integer> map = new HashMap<>();

        map.put("John", 30);
        map.put("Prasad", 40);
        map.put("RAJ", 50);
        map.put("DEEP", 60);

        List<Map.Entry<String,Integer>> entries= new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1,  o2) -> o1.getKey().compareTo(o2.getKey()));


        for(Map.Entry<String,Integer> entry: entries)
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }
}
