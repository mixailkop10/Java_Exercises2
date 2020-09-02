import Model.*;
import Service.Ui;

public class Main {

    public static void main(String[] args) {
        Ui ui = new Ui();
        //menu for simple acc in following comment

        /*Account account = new Account("erieta",200,0);

        do{
            ui.menu();
        }while (ui.tester(account));*/

        //menu for Store acc in following comment

        /*StoreAccount store = new StoreAccount("mixalis", "basic");
        store.setNumberOfTransactions(0);
        store.setBalance(0);

        do{
            ui.menu2();
        }while (ui.tester(store));*/

        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. NaftisA", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        //testing SimpleStore
        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        //testing InventoryStore
        IStore invStore= new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();
    }
}
