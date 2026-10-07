import java.util.Scanner;
class Positiveno{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<10;i++){
            System.out.println("enter no"+i);
            int j=sc.nextInt();
            if(j<0){
                continue;
            }
            System.out.println("Positive no is"+j);
        }
    }
}