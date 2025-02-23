package JavaProgramming1.Part4.IntrotoOOP;

    class Account{
        private String name;
        private double blance;

        public Account(String AccountName, double intialbalance){
            this.name=AccountName;
            this.blance=intialbalance;
        }
        public void deposit (double ammount){
            this.blance+=ammount;
        }

        public void withdraw(double amount){
            this.blance-=amount;
        }
        public double balance(){
            return this.blance;
        }

        public void printInfo(){
            System.out.println("Account Name: "+this.name+"\n"+
                    "Balance: "+this.blance+"\n");
        }


    }
public class YourFirstAccount {

    public static void main(String[] args){
        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

    }
}
