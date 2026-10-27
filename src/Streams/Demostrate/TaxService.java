package Streams.Demostrate;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluteTaxUsers()
    {
        List<Employee> employees = DataBase.getEmployees();
       return DataBase.getEmployees()
               .stream()
               .filter(emp->emp.getSalary()>500000)
               .collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        System.out.println(evaluteTaxUsers());
    }

}
