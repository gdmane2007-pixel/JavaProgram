class StudInfo{
    
    //data members 
    String name;
    int rollName;

    //parameterized constructor
    StudInfo(String name , int rollName ){

        this.name = name;
        this.rollName = rollName;

    }
    //method 
    void display(){

        System.out.println("name = " + name);
        System.out.println("roll no = " + rollName);
    }
}
public class ParameterizedConstr{
    public static void main(String []args){

        //object created
        StudInfo s1 = new StudInfo("gayatri ", 22);
        s1.display();

    }
}