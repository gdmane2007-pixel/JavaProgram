class Stud{

    String name;
    int marks;

    //no argument constructor 
    Stud() {
        name = "unknown ";
        marks = 85;
    }
    
    //method 
    void display() {
        System.out.println("name is " + name );
        System.out.println("marks are " + marks );
    }
}

    public class NoArgu{
        public static void main(String [] args){

            //object created
            Stud s1 = new Stud();
            s1.display();
        }
    }
