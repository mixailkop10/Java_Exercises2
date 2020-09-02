import Model.Account;
import Model.StoreAccount;
import Service.Ui;

public class Main {

    public static void main(String[] args) {
        System.out.println("Liverpool the Best");

        Account account = new Account("erieta",200,0);
        Ui ui = new Ui();

        do{
            ui.menu();
        }while (ui.tester(account));

        StoreAccount store = new StoreAccount("mixalis", "basic");
        store.setNumberOfTransactions(0);
        store.setBalance(0);

        do{
            ui.menu2();
        }while (ui.tester(store));
    }
}
