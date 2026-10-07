import java.util.Scanner;
class Reverse{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int i=sc.nextInt();
        int rev=0;
        while(i!=0){
            int sum =i %10;
            rev=rev*10+sum;
           i=i/10;
        }
        System.out.println("reverse of no is"+rev);
    }
}