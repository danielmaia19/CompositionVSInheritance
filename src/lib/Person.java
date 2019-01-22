package lib;

public class Person implements Employable, Roleable{

    Name name;
    private String role;
    private double salary;
    private String empNo;
    private String startDate;

    public Person(String firstName, String lastName, String empNo, String startDate, double salary) {
        this.name = new Name(firstName, lastName);
        this.role = "N/A";
        this.salary = salary;
        this.empNo = empNo;
        this.startDate = startDate;
    }

    @Override
    public String role() {
        return this.role;
    }

    @Override
    public double salary() {
        return this.salary;
    }

    @Override
    public String empNo() {
        return this.empNo;
    }

    @Override
    public String startDate() {
        return this.startDate;
    }
}
