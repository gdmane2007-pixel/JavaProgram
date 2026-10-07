import java.util.Scanner;
class Student_data{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        String name=sc.nextLine();
        int total_marks=0;
        for(int i=1;i<=5;i++){
            System.out.println("enter marks of subject"+i);
            int marks=sc.nextInt();
            total_marks=total_marks +marks;
        }
        double percentage=(total_marks/5.0);
        System.out.println("student name is "+name);
        System.out.println("total marks is "+total_marks);
        System.out.println("precentage is "+percentage);
        
        if(percentage>=80){
            System.out.println("grade is A");
        }else if (percentage>=70){
                System.out.println("grade is B");
            }
            else if (percentage>=60){
                System.out.println("grade is C");
            }
            else if (percentage>=40){
                System.out.println("grade is D");
            }else{
                System.out.println("FAIL");
        }

    }
}
