package org.example.links;

public class Main {
    public static void main(String[] args) {
        PersonFactory<Person1> personFactory = Person1::new;
        Person1 person = personFactory.create("Peter", "Parker");
        System.out.println(person.getFirstName() + " " + person.getLastName());
    }
}
