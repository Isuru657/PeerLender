package com.peerlender.lendingengine.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public final class User {

    @Id
    private long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String occupation;

    public User(String firstName, String lastName, int age, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(occupation, user.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, occupation);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
// User credentials. Age matters because people probably don't want to lend to people younger than 20 for example.
// Using constructors helped initialize the finals so the error go away now
// People create classes but they don't override hasCodes and equals
// equals matters when you're putting things into a hash set or hashmap and the hashcode is needed to generate unique ids for items stored

