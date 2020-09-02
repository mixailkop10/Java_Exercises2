package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryRetailStore implements IStore{
    private List<Product> productListBeforeSell = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();

    @Override
    public void buy(Product product) {
        productList.add(product);
        productListBeforeSell.add(product);
    }

    @Override
    public void sell(Product product) {
        if(productList.contains(product))
            productList.remove(product);
        else
            System.out.println(product.getName() + " Does not exist!");
    }

    @Override
    public double getRevenue() {
        double revenueAfterSell = 0;
        double revenueBeforeSell = 0;

        for(Product p : productListBeforeSell){
            revenueBeforeSell += p.getPriceWhenBuy();
            if(productList.contains(p) == false)
                revenueAfterSell += p.getPriceWhenSell();
        }
        return revenueAfterSell-revenueBeforeSell;
    }

    @Override
    public void getInventory() {
        System.out.println("Products in our Inventory: ");
        for(Product p : productList) {
            System.out.println(p.getName());
        }

    }

    @Override
    public void reset() {
        productList.clear();
    }
}
