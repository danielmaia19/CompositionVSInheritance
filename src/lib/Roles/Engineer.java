package lib.Roles;

import lib.Employable;
import lib.Person;
import lib.Roleable;

public class Engineer implements Roleable {

    Person employee;
    private String position;

    public Engineer(String firstName, String lastName, String empNo, String startDate, double salary) {
        this.employee = new Person(firstName, lastName, empNo, startDate, salary);
        this.position = this.getClass().getSimpleName();
    }

    @Override
    public String role() {
        return this.position;
    }

    @Override
    public double salary() {
        return employee.salary();
    }

    @Override
    public String empNo() {
        return employee.empNo();
    }

    @Override
    public String startDate() {
        return employee.startDate();
    }
}
