import java.util.Scanner;
class sum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many no.");
        int n =sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("enter no");
            int j=sc.nextInt();
            sum=sum+j;
        }
        System.out.println("total sum"+sum);
    }
}