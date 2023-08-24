package list.operacoes_basicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SellCart {
    private List<Item> sellCart;
    private String emptyCartString = "A Lista está vazia";

    public SellCart() {
        this.sellCart = new ArrayList<>();
    }

    public void addItemToCart(String name, double price, int qty) {
        Item item = new Item(name, price, qty);
        sellCart.add(item);
    }

    public void removeItemFromCart(String name) {
        if (!sellCart.isEmpty()) {
            List<Item> itensToRemove = new ArrayList<>();
    
            for (Item item : sellCart) {
                if (item.getName().equalsIgnoreCase(name)) {
                    itensToRemove.add(item);
                }
            }
    
            sellCart.removeAll(itensToRemove);
        } else {
            System.out.println(emptyCartString);
        }
    }

    private String formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(price);
    }

    public String calcTotalprice() {
        if (!sellCart.isEmpty()) {
            double totalPrice = 0;
    
            for (Item item : sellCart) {
                double price = item.getPrice() * item.getQty();
                totalPrice += price;
            }
    
            return formatPrice(totalPrice);
        } else {
            return emptyCartString;
        }
    }

    public void showItensOnCart() {
        System.out.println(sellCart.isEmpty() ? emptyCartString : sellCart);
    }

    public static void main(String[] args) {
        SellCart sellCart = new SellCart();
        sellCart.addItemToCart("Ovo", 16.22, 3);
        sellCart.addItemToCart("Ovo", 16.22, 10);
        sellCart.addItemToCart("Banana", 6.99, 1);
        sellCart.showItensOnCart();
        System.out.println("Total Price: " + sellCart.calcTotalprice());
        sellCart.removeItemFromCart("Ovo");
        sellCart.showItensOnCart();
    }
}
