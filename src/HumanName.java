public class HumanName {
    String firstName;
    String lastName;

    public HumanName(String firstName, String lastName) {
        this.firstName= firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String name) {
        firstName=name;
    }

    public String getFirstName() {
        return firstName;
    }
}
