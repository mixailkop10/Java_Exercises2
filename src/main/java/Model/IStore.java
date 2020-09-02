package Model;

import Model.Product;

public interface IStore {
    public void buy(Product product);
    public void sell(Product product);
    public double getRevenue();
    public void getInventory();
    public void reset();
}
