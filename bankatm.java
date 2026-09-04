import java.util.Scanner;
class ATM {

    String bankName;
    int balance;

    int checkBalance() {
      return balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " Deposited");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " Withdrawn");
        } else {
            System.out.println("low Balance");
        }
    }
}
public class Main{

    public static void main(String[] args) {

        ATM sbi = new ATM();
        sbi.bankName = "Sbi";
        sbi.balance = 10000;

        ATM icici = new ATM();
        icici.bankName = "Icc";
        icici.balance = 15000;

        ATM hdfc = new ATM();
        hdfc.bankName = "Hdfc";
        hdfc.balance = 20000;

        ATM axis = new ATM();
        axis.bankName = "Axis";
        axis.balance = 25000;

        ATM canara = new ATM();
        canara.bankName = "Canara";
        canara.balance = 30000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bank");
        System.out.println("1. SBI");
        System.out.println("2. Icc");
        System.out.println("3. HDFC");
        System.out.println("4. AXIS");
        System.out.println("5. CANARA");

        int bank = sc.nextInt();

        ATM atm = null;

        switch (bank) {
            case 1: atm = sbi; break;
            case 2: atm = icici; break;
            case 3: atm = hdfc; break;
            case 4: atm = axis; break;
            case 5: atm = canara; break;
            default:
                System.out.println("Invalid Bank");
                return;
        }

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        int option = sc.nextInt();
        
        switch (option) {
            case 1:

        System.out.println("Balance : " + atm.checkBalance());
                break;

            case 2:
                System.out.print("Enter Amount: ");
                int d = sc.nextInt();
                atm.deposit(d);
                atm.checkBalance();
                break;

            case 3:
                System.out.print("Enter Amount: ");
                int w = sc.nextInt();
                atm.withdraw(w);
                atm.checkBalance();
                break;
            case 4:
                System.out.println("Exit!");

            default:
                System.out.println("Invalid Option");
        }
    }
}

