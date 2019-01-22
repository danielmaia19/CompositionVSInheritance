package lib.Roles;

import lib.Employable;
import lib.Person;
import lib.Roleable;

public class Cleaner implements Roleable {

    Person employee;
    private String position;

    public Cleaner(String firstName, String lastName, String empNo, String startDate, double salary) {
        employee = new Person(firstName, lastName, empNo, startDate, salary);
        position = this.getClass().getSimpleName();
    }

    @Override
    public double salary() {
        return 0;
    }

    @Override
    public String empNo() {
        return null;
    }

    @Override
    public String startDate() {
        return null;
    }

    @Override
    public String role() {
        return null;
    }
}
