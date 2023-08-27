package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    private Map<Long, Product> productsInventory;

    public ProductInventory() {
        this.productsInventory = new HashMap<>();
    }

    public void addProduct(long code, String name, double price, int qty) {
        this.productsInventory.put(code, new Product(name, price, qty));
    }

    public void printProducts() {
        System.out.println(this.productsInventory);
    }

    public double calcInventoryTotalValue() {
        double totalInvetoryValue = 0d;

        if (!this.productsInventory.isEmpty()) {
            for (Product product : this.productsInventory.values()) {
                totalInvetoryValue += product.getQty() * product.getPrice();
            }
        }
        return totalInvetoryValue;
    }

    public Product findExpensiveProduct() {
        Product expensiveProduct = null;
        double greaterPrice = Double.MIN_VALUE;

        if (!this.productsInventory.isEmpty()) {
            for (Product product : this.productsInventory.values()) {
                if (product.getPrice() > greaterPrice) {
                    expensiveProduct = product;
                    greaterPrice = product.getPrice();
                }
            }
        }
        return expensiveProduct;
    }

    public Product findCheaperProduct() {
        Product cheaperProduct = null;
        double lowerPrice = Double.MAX_VALUE;

        if (!this.productsInventory.isEmpty()) {
            for (Product product : this.productsInventory.values()) {
                if (product.getPrice() < lowerPrice) {
                    cheaperProduct = product;
                    lowerPrice = product.getPrice();
                }
            }
        }
        return cheaperProduct;
    }

    public Product findFinancialMoreRepresentative() {
        Product moreRepresentativeProduct = null;
        double greater = Double.MIN_VALUE;

        if (!this.productsInventory.isEmpty()) {
            for (Product product : this.productsInventory.values()) {
                double currentValue = product.getPrice() * product.getQty();
                if (currentValue > greater) {
                    moreRepresentativeProduct = product;
                    greater = currentValue;
                }
            }
        }
        return moreRepresentativeProduct;
    }

    public static void main(String[] args) {
        ProductInventory productInventory = new ProductInventory();
        productInventory.addProduct(1L, "Produto A", 5d, 10);
        productInventory.addProduct(3L, "Produto B", 15d, 2);
        productInventory.addProduct(2L, "Produto C", 10d, 6);

        productInventory.printProducts();
        System.out.println("Valor total do estoque: " + productInventory.calcInventoryTotalValue());
        System.out.println("Produto mais caro do estoque: " + productInventory.findExpensiveProduct());
        System.out.println("Produto mais barato do estoque: " + productInventory.findCheaperProduct());
        System.out.println("O Produto que tem maior representatividade financeira no estoque: " + productInventory.findFinancialMoreRepresentative());
    }
    
}
