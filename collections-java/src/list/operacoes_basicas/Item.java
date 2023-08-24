package list.operacoes_basicas;

public class Item {
    private String name;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        return "name: " + name + " price: " + price + " qty: " + qty;
    }
}
