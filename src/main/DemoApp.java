package main;

import lib.*;
import lib.Roles.Engineer;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {

    public static void main(String [ ] args) {

//        Employee emp = new Employee();
//        System.out.println(emp.getEmpNo());
//        System.out.println(emp.getFirstLastName());
//

//        System.out.println("****************************************");
//
//        List<Roleable> rolls = new ArrayList<>();
//        rolls.add(new Engineer());
//        rolls.add(new Cleaner());
//        rolls.add(new Manager());
//
//        for (Roleable roll : rolls) {
//            System.out.println(roll.role());
//        }
//
//        System.out.println("****************************************");
        
//        List<Employee> emp1 = new ArrayList<>();
//
//        emp1.add(new Employee());
//
//        emp1.get(0).setFirstName("Daniel");
//        System.out.println(emp1.get(0).getFirstName());
//
//        System.out.println(emp1.get(0).getFirstLastName());
//
//        emp1.get(0).setRole("Cleanner");
//        System.out.println(emp1.get(0).role());
//
//        System.out.println("****************************************");

        List<Roleable> role = new ArrayList<>();

        role.add(new Engineer("John", "Michael", "P1718603X",
                                "26/10/1992", 250.00));


        for(Roleable r: role) {
            System.out.println(r.role());
            System.out.println(r.empNo());
            System.out.println(r.salary());

        }

        System.out.println("****************************************");
        
        List<Employable> emp = new ArrayList<>();
        
        emp.add(new Person("Daniel", "Maia", "22554688", "26/10/2019", 250));
        
        for(Employable p : emp) {
            System.out.println(p.empNo());
            System.out.println(p.salary());
            System.out.println(p.startDate());
        }
        

    }


}
