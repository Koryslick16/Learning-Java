package org.aptech.OOP;
// INHERITANCE
//SUPER CLASS
public class Employees {
    private int empId;
    private String firstName;
    private String lastName;
    private int age;

    public Employees(int empId, String firstName, String lastName, int age) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void employeeDetails() {
        System.out.println(
//                "Employees{" +
                        "EmpId: " + empId +
                        "\nFirstName: " + firstName +
                        "\nLastName: " + lastName +
                        "\nAge: " + age + " years"
//                        '}'
        );
    }
}
