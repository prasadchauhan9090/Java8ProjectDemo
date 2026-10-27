package FunctionalInterfaceDemo;

import java.util.*;
import java.util.function.Supplier;

public class SupplierDemo {


  //  @Override
//    public String get() {
//        return "Hello Chauhan Welcome to JAVA 8 Feature";
//    }

    public static void main(String args[]) {
        // Supplier<String> supplier = ;

        List<String> list = Arrays.asList();


        System.out.println(list.stream().findAny().orElseGet(() -> "Hello Chauhan Welcome to JAVA 8 Features "));


        List<String> lst = new ArrayList<>();

        lst.add("prasad");
        lst.add("chauhan");
        lst.add("welcome");
        lst.add("chauhan");
        lst.add("welcome");

        lst.stream().forEach(t->System.out.println(t));


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"prasad");
        map.put(2,"chauhan");
        map.put(3,"welcome");
        map.put(4,"chauhan");

        map.forEach((key,value)->System.out.println(key+" : "+value));

    }


}
