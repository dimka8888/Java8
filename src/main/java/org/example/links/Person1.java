package org.example.links;


public class Person1 {
    private final String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
interface PersonFactory<P extends Person1> {
    P create(String firstName, String lastName);
}