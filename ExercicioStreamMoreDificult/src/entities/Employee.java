package entities;



public class Employee{
    String name;
    String mail;
    Double Salary;

    public Employee(String name, String mail, Double Salary ) {
       
        this.name = name;
         this.mail = mail;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }




}    


    

