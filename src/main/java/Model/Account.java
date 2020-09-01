package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    public double withdraw(double sum){
        numberOfTransactions ++;
        return balance -= sum;
    }

    public double deposit(double sum){
        numberOfTransactions ++;
        return balance += sum;
    }

    public void tester(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("Give a sum you want to withdraw: ");
        sum = Double.parseDouble(scanner.nextLine());
        withdraw(sum);
        System.out.println("The new Balance is :" +getBalance());

        System.out.println("Give a sum you want to deposit: ");
        sum = Double.parseDouble(scanner.nextLine());
        deposit(sum);
        System.out.println("The new Balance is :" +getBalance());
    }
}
