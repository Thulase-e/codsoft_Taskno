import java.io.*;
class Bank{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double balance;
    public Bank(double init_bal){
        balance = init_bal;
    }

    public void getbal(){
        System.out.println("the current balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.print(" deposited successfully and the current balance is: "+balance);
        }
        else{
            System.out.println("deposited amount should be greater than zero");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("withdraw success and the balance amount is: "+balance);
        }
        else if(amount > balance){
            System.out.println("balance is Insufficient");
        }
        else{
            System.out.println("amount withdrawl should be greater than zero");
        }
    }

    void disp()throws IOException{
        System.out.println("1.check balance  2.deposit  3.withdraw ");
        System.out.println("enter the your choice: ");
        int choice = Integer.parseInt(br.readLine());

        switch(choice) {
            case 1: getbal();
                    break;
            case 2: System.out.println("enter the deposit amount");
                    double deposit_amt = Double.parseDouble(br.readLine());
                    deposit(deposit_amt);
                    break;
            case 3:
                    System.out.println("enter the withdraw amount");
                    double withdraw_amt = Double.parseDouble(br.readLine());
                    withdraw(withdraw_amt);
                    break;
            default:
                System.out.println("Invalide choice.Please try again");
        }
    }
}
public class ATMInterface {
    public static void main(String args[])throws IOException{
        Bank b = new Bank(1000.0);
        b.disp();
        }
    }
