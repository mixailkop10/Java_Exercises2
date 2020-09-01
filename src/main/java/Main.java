import Model.Account;
import Service.Ui;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Liverpool the Best");

        Account account = new Account("erieta",200,0);
        Ui ui = new Ui();

        do{
            ui.menu();
        }while (ui.tester(account));
    }
}
