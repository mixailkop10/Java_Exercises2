package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StoreAccount extends Account{

    private String storeName;
    private String accountCategory;

    @Override
    public double withdraw(double sum) {
        return super.withdraw(sum);
    }

    @Override
    public double deposit(double sum) {
        return super.deposit(sum);
    }

    public void changeCategory(){
        System.out.println("Choose the new Category\n" +
                "1.basic\n" +
                "2.mid\n" +
                "3.extra\n" +
                "4.premium\n" );
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        boolean keep = true;
        do {
            if (answer == 1) {
                this.accountCategory = "basic";
                keep = false;
            }
            else if (answer == 2) {
                this.accountCategory = "mid";
                keep = false;
            }
            else if (answer == 3) {
                this.accountCategory = "extra";
                keep = false;
            }
            else if (answer == 4) {
                this.accountCategory = "premium";
                keep = false;
            }
            else {
                System.out.println("Invalid answer. Try again");
                answer = Integer.parseInt(scanner.nextLine());
            }
        }while(keep);
        System.out.println("The new Category is: " +this.accountCategory);
    }
}
