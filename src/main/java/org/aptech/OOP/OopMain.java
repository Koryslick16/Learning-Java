package org.aptech.OOP;

public class OopMain {
    public static void main(String[] args){
//        var person = new Person(1, "Jacob", "Inala", "Male");
//        person.setFirstName("Inala");
//        System.out.println("Id: "+ person.getId() + "\nFullName: "+ person.getSurname() +" " + person.getFirstName());
//        var manager = new Manager(12, "Korede" , " Bisola", 23, 5);
//        System.out.println("Id: "+ manager.getEmpId() + "\nFullName: "+ manager.getFirstName()+ manager.getLastName()+ "\nAge: "+ manager.getAge()+ "\nTeamSize: "+ manager.getTeamSize());
//        System.out.println("***************************************************************************************");
//        String[] tasks = {"Print Media", "Advertise Benefits", "Gain customer's trust"};
//        Marketer marketer = new Marketer(15,"Kimberly", "Gerald", 26, tasks, 500);
//        marketer.employeeDetails();

//        Arithmetic arith = new Arithmetic();
//        System.out.println(arith.add(5, 6, 9, 23));
        var cCard = new CreditCard();
        var payStack = new PayStack();
        var fWave = new FlutterWave();
        Payment payment = new Payment();
        payStack.amount = 3400.00;
        payStack.payOut();
        fWave.amount = 2760.00;
        fWave.payOut();
        cCard.amount = 4130.00;
        cCard.payOut();
    }
}
