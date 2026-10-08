class Student{
    String name;
    int marks;
}
class StudentFact{
    Student create_student(){
        Student s = new Student();
        s.name = "xyz";
        s.marks = 35;
        
        return s;
    }
    
        public static void main(String [] args){
            StudentFact fr = new StudentFact();
            Student s1 = fr.create_student();
            System.out.println("the name is " + s1.name);
            System.out.println("the marks " + s1.marks);
        }
    }
