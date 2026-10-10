class BankAccount{

    private int AccountNo;
    private String HolderName;
    private double balance;

    void setAccountNo (int AccountNo){
        this.AccountNo = AccountNo;
    }
    void setHolderName (String HolderName){
        this.HolderName = HolderName;
    } 
    void setbalance(double balance){
        if(balance > 0){
            this.balance = balance;
        }else{
            System.out.println("invalid");
        }
    }

    int getAccountNo(){
        return AccountNo;
    }
    String getHolderName(){
        return HolderName;
    }
    double getbalance(){
        return balance;
    }
}
    public class SetterGetter{
        public static void main(String[] args){

            BankAccount b1 = new BankAccount();

            b1.setAccountNo(2536);
            b1.setHolderName("gayatrii");
            b1.setbalance(50000);

            System.out.println("account no:" + b1.getAccountNo());
            System.out.println("Holder name :" + b1.getHolderName());
            System.out.println("Balance:" + b1.getbalance());
        }
    }
