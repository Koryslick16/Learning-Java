package org.aptech.OOP;
// INHERITANCE
// CHILD CLASS
public class Manager extends Employees {
    private int teamSize;

    public Manager(int empId, String firstName, String lastName, int age, int teamSize){
        super( empId, firstName, lastName, age);
        this.teamSize = teamSize;
    }


    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void employeeDetails(){
        super.employeeDetails();
        System.out.print("\nTeams size: "+ teamSize);
    }
}
