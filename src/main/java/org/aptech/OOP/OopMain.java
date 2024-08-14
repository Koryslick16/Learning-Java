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
//        var cCard = new CreditCard();
//        var payStack = new PayStack();
//        var fWave = new FlutterWave();
//        Payment payment = new Payment();
//        payStack.amount = 3400.00;
//        payStack.payOut();
//        fWave.amount = 2760.00;
//        fWave.payOut();
//        cCard.amount = 4130.00;
//        cCard.payOut();

//        using the main abstract to create an instance of Ferrari, Ferrari can be instantied normally as it is the extension of the abstract class and is not an abstract class itself
        Car car = new Ferrari();
        System.out.println(car.acceleration(280));

    }
}

// ABSTRACT CLASS
// Abstract method cannot have a body. you cannot create an instance of the class, an abstract class cannot be instantiated
// abstract method must be public, u need a key word.
// instance of interface cannot be created as it is not a class