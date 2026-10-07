class Palindrome{
    public static void main(String[] args){
        int number=152;
        int originalNo =number;
        int reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        if(originalNo==reverse){
            System.out.println("Palindrome");

        }else{
            System.out.println("not Palindrome");
        }
    }
}