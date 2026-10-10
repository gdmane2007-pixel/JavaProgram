class Employee{

    // data members
    private String name;
    private int Empid;
    private double salary;

    Employee(String name , int Empid  , double salary){

        this.name = name;
        this.Empid = Empid;
        this.salary = salary;
    }
    void display(){

        System.out.println(" employee name =" + name);
        System.out.println("enter employee id =" + Empid);
        System.out.println("enter salary =" + salary);

    }
}
public class HRSystem{
    public static void main(String [] args){
        
        Employee e1 = new Employee( "gayatri ", 525 , 55000);
        e1.display();
    }
}