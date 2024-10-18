package inClass;

import java.util.Date;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private Date birth;

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
    public Date getBirth() {return birth;}
    public void setBirth(Date birth) {this.birth = birth;}


    public Person(long id, String firstName, String lastName, double salary, Date birth){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birth = birth;
    }

    @Override
    public String toString(){
        return "Person id= " + id + ", first name =" + firstName + ", last name = " + lastName + ", salary = " + salary + "birth ="+ birth;    
    }

    public void print(){
        System.out.println(toString());
    }
    
}
