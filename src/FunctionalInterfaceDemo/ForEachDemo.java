package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String args[]) {

//        Map<Integer, String> list = new HashMap<>();
//        list.put(1, "prasad");
//        list.put(2, "chauhan");
//        list.put(3, "welcome");
//        list.put(4, "shanvi");
//        list.put(5, "mounika");
//        list.put(6, "haidi");
//        list.put(7, "BABY");

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




        
        
        

//        list.forEach((key, value) -> System.out.println(key + " : " + value));
//
//        System.out.println("===================");
//
//        list.entrySet().stream().forEach(t->System.out.println(t.getKey() + " : " + t.getValue()));
    }
}
