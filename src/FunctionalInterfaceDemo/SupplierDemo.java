package FunctionalInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo {


  //  @Override
//    public String get() {
//        return "Hello Chauhan Welcome to JAVA 8 Feature";
//    }

    public static void main(String args[])
    {
        Supplier<String> supplier = () -> "Hello Chauhan Welcome to JAVA 8 Features ";

       System.out.println(supplier.get());
    }

}
