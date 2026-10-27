package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "prasad");
        map.put(2, "chauhan");
        map.put(3, "welcome");
        map.put(4, "shanvi");
        map.put(5, "mounika");
        map.put(6, "haidi");
        map.put(7, "BABY");

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));



        List<String> list = new ArrayList<>();
        list.add("prasad");
        list.add("pomkin");
        list.add("praksham");
        list.add("shanvi");
        list.add("mounika");
        list.add("haidi");
        list.add("people");
        list.add("prasad");
        list.add("chauhan");
        list.add("welcome");
        list.add("shanvi");
        list.add("mounika");
        list.add("haidi");
        list.add("BABY");

        
        for(String s : list)
        {
            if(s.startsWith("p"))
            {
                System.out.println(s);
            }
            
        }
        list.stream().filter(t->t.startsWith("p")).forEach( (t)->System.out.println(t));




        
        
        

//        map.forEach((key, value) -> System.out.println(key + " : " + value));
//
//        System.out.println("===================");
//
//        map.entrySet().stream().forEach(t->System.out.println(t.getKey() + " : " + t.getValue()));
    }
}
