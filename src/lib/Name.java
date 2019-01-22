package lib;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String firstLastName() {
        return this.getFirstName() + " " + this.getLastName();
    }

}
