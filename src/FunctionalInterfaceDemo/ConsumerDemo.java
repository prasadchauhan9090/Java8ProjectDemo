package FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String args[])
    {


       Consumer<Integer> cm = (t)->{System.out.println("Printing : "+ t);};

       cm.accept(15);

       List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9);

       list.forEach(cm);

    }


}
