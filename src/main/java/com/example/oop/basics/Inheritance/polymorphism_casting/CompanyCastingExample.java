package com.example.oop.basics.Inheritance.polymorphism_casting;


class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("pracuje pracownik");
    }
public void printInfo(){
    System.out.println("Employee: " + name);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String department;

    public void hireEmployee() {
        System.out.println("Employee hired");
    }
    public void printInfo(){
        System.out.println("Manager " + getName());
    }
    public void giveRise(Employee employee) {
        System.out.println("Employee got rise: " + employee.getName())
        ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager() {
        department = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String department) {
        super(name, jobTitle, salary);
        this.department = department;
    }
}

class Ceo extends Manager {
    private int sharesNumber;

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public void signContract() {
        System.out.println("Contract signed");

    }

    public Ceo() {
        sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, int salary, String department, int sharesNumber) {
        super(name, jobTitle, salary, department);
        this.sharesNumber = sharesNumber;
    }
    public void printInfo(){
        System.out.println("Ceo " + getName());
    }
}

public class CompanyCastingExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Programmer", 1000);
        Manager manager = new Manager("Kasia", "Team Leader", 1000, "R&D");
        Employee employeeCeo = new Ceo("Arek", "śmieszek firmowy", 100, "dział gier i zabaw", 7);

        if (employeeCeo instanceof Ceo) {
            Ceo ceo = (Ceo) employeeCeo;
            ceo.signContract();
        }


    }
}
