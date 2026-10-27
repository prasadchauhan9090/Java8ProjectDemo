package FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {


  //  @Override
//    public String get() {
//        return "Hello Chauhan Welcome to JAVA 8 Feature";
//    }

    public static void main(String args[])
    {
       // Supplier<String> supplier = ;

        List<String> list = Arrays.asList();



       System.out.println(list.stream().findAny().orElseGet(() -> "Hello Chauhan Welcome to JAVA 8 Features "));
    }



}
