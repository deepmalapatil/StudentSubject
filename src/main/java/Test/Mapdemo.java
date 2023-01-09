package Test;

import java.util.*;
import java.util.stream.Collectors;
class Employee {
    //Create Employee
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
        class Mapdemo {


            public static void main(String[] args) {
// Add integer no
       /* List<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        List<Integer> list1=list.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list1);*/

                //convert uppercase latters

       /* List<String> list= new ArrayList<String>();
        list.add("bela");
        list.add("aaditi");
        list.add("niraj");
        list.add("deepa");
        System.out.println(list);

        List<String> list1=list.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);*/

                List<Employee> employeelist = new ArrayList<Employee>();
                employeelist.add(new Employee(1, "Aaditi", 10000));
                employeelist.add(new Employee(2, "Bela", 20000));
                employeelist.add(new Employee(3, "Niraj", 30000));
                employeelist.add(new Employee(4, "Deepa", 40000));

                System.out.println(employeelist);

              //  List<Employee> list=employeelist.stream().map(name->name.salary).collect(collectors.tolist());
            }
        }
