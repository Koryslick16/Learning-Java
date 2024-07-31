package org.aptech.OOP;
// INHERITANCE
// CHILD CLASS
public class Marketer extends Employees{
    private String[] tasks;
    private double bonus;

    public Marketer(int empId, String firstName, String lastName, int age, String[] tasks, double bonus){
        super( empId, firstName, lastName, age);
        this.tasks = tasks;
        this.bonus = bonus;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void employeeDetails(){
        System.out.println("*************-- Employee Details --************");
        super.employeeDetails();
        int count = 1;
        System.out.println("*************-- Task Assigned --***************");
        for (String task : tasks){
            System.out.println("Assigned Task "+ count + ": "+ task);
            count++;
        }
        System.out.println("***********-- Bonus --************");
        System.out.print("Bonus Salary: "+ bonus * tasks.length);
    }
}
