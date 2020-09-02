package Service;

import Model.Account;
import Model.StoreAccount;

import java.util.Scanner;

public class Ui {

    Account account = new Account();
    StoreAccount storeAccount = new StoreAccount();

    public void menu(){
        System.out.println(" =============== ");
        System.out.println(" Proceed with your Request ");
        System.out.println("1. Deposit an amount ");
        System.out.println("2. Withdraw an amount ");
        System.out.println("3. Check your Balance ");
        System.out.println("0. Exit ");
        System.out.println(" =============== ");
    }

    public void menu2(){
        System.out.println(" =============== ");
        System.out.println(" Proceed with your Request ");
        System.out.println("1. Deposit an amount ");
        System.out.println("2. Withdraw an amount ");
        System.out.println("3. Check your Balance ");
        System.out.println("4. Change Category ");
        System.out.println("0. Exit ");
        System.out.println(" =============== ");
    }
    public boolean tester(Account account){

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        boolean continues = true;

        double sum = 0;

        switch (answer) {
            case 1:
                System.out.println("Give the amount");
                sum = Double.parseDouble(scanner.nextLine());
                account.deposit(sum);
                System.out.println("Sum successfully deposited!!");
                break;
            case 2:
                System.out.println("Give the amount");
                sum = Double.parseDouble(scanner.nextLine());
                while (sum > account.getBalance()){
                    System.out.println("That amount exceeds your balance.");
                    System.out.println("Give a legit amount.");
                    sum = Double.parseDouble(scanner.nextLine());
                }
                account.withdraw(sum);
                System.out.println("Sum successfully withdrawn!!");
                break;
            case 3:
                System.out.println("Your balance is: " +account.getBalance());
                break;
            case 0:
                System.out.println("Number of transactions made: " +account.getNumberOfTransactions());
                continues = false;
                break;
            default:
                System.out.println();
                continues = false;
                break;
        }
        return continues;
    }

    public boolean tester(StoreAccount storeAccount){

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        boolean continues = true;

        double sum = 0;

        switch (answer) {
            case 1:
                System.out.println("Give the amount");
                sum = Double.parseDouble(scanner.nextLine());
                account.deposit(sum);
                System.out.println("Sum successfully deposited!!");
                break;
            case 2:
                System.out.println("Give the amount");
                sum = Double.parseDouble(scanner.nextLine());
                while (sum > account.getBalance()){
                    System.out.println("That amount exceeds your balance.");
                    System.out.println("Give a legit amount.");
                    sum = Double.parseDouble(scanner.nextLine());
                }
                account.withdraw(sum);
                System.out.println("Sum successfully withdrawn!!");
                break;
            case 3:
                System.out.println("Your balance is: " +account.getBalance());
                break;
            case 4:
                storeAccount.changeCategory();
                break;
            case 0:
                System.out.println("Number of transactions made: " +account.getNumberOfTransactions());
                continues = false;
                break;
            default:
                System.out.println();
                continues = false;
                break;
        }
        return continues;
    }
}
