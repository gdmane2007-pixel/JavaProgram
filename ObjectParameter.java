class ObjectParameter{

    String AccountHolderName;
    double balance;

    void transferTo(ObjectParameter receiver,  double amount) {

        balance = balance - amount ;
        receiver.balance = receiver.balance + amount;

    }
    public static void main(String[] args){

    ObjectParameter a1=new ObjectParameter();
    ObjectParameter a2=new ObjectParameter();
    a1.balance = 5000;
    a2.balance = 3000;
    
    a1.transferTo(a2 ,1000); 
    System.out.println(" Balance1 =" + a1.balance);
    System.out.println(" Balance2=" + a2.balance);
    }
}