class Info{
     
    //data member
    String name;
    int marks;
    
    //no argument constructor
    Info(){

        name = "gayatri";
        marks = 22;
    }

    //parameterized constructor with one parameter
    Info(String name){

        this.name = name;
    }

    // parameterized constructor with two parameter
    Info(String name , int marks){
        
        this.name = name;
        this.marks = marks;
    }
    void display(){

        System.out.println(" name =" + name);
        System.out.println("marks = " + marks );
    }
}
public class ConstrOverLoaded{
    public static void main(String [] args){

        //no argument constructor object created
        Info i1 = new Info();

        //parameterized construtor with one parameter object created
        Info i2 = new Info("gayatrii");

        //parameterized constructor with two parameter object created
        Info i3 = new Info("gayatriiii " , 22);

        i1.display();
        i2.display();
        i3.display();
    }
}