package JavaProgramming1.Part4.IntrotoOOP;


    public class YourFirstBankTransfer {
    public static void main(String[] args) {


        Account Matthews= new Account("Matthews account", 1000);
        Account myacciunt =new Account("My acciunt",0);

        Matthews.withdraw(100);
        myacciunt.deposit(100);

        Matthews.printInfo();
        myacciunt.printInfo();

    }

}
