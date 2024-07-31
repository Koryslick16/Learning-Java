package org.aptech.OOP;

// ENCAPSULATION
public class Person {
    private int id;
    private String surname;
    private String firstName;
    private String gender;

//    public Person(){}


    public Person(int id, String surname, String firstName, String gender) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
