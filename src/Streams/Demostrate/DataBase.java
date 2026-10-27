package Streams.Demostrate;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees()
    {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"ROSHAN","CORE",300000));
        list.add(new Employee(102,"PRASAD","IT",600000));
        list.add(new Employee(103,"MOON","MECH",800000));
        list.add(new Employee(104,"KISAN","SOCIAL",900000));
        list.add(new Employee(105,"ROHITH","CIVIL",400000));
        list.add(new Employee(106,"DEVIL","DEFENCE",500000));

        return list;

    }
}
