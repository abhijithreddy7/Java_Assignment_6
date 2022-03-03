package assignment.partfour;
import java.lang.reflect.Array;

public class Employee {
    public String name;

    public Employee(String name){
        this.name=name;
    }

    public void printName(){
        System.out.println("Name of employee is: "+name);
    }

    public static void main(String[] args) {
        Employee[] empList = {new Employee("John"),new Employee("Kyle")};
        empList[0].printName();
        empList[1].printName();
    }
}