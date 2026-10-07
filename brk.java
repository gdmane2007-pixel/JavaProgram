import java.util.Scanner;
class numberBreak{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("enter no"+i);
            int j=sc.nextInt();
            if(j==50){
                break;
            }
        }
    }
}