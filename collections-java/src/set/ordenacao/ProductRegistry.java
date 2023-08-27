package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistry {
    private Set<Product> productSet;

    public ProductRegistry() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int qty) {
        this.productSet.add(new Product(name, code, price, qty));
    }

    public Set<Product> printProductsByName() {
        Set<Product> productsByName = new TreeSet<>(this.productSet);
        return productsByName;
    }

    public Set<Product> printProductsByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new PriceComparator());
        productByPrice.addAll(productSet);
        return productByPrice;
    }
    
    public Set<Product> printProductsByQty() {
        Set<Product> productByQty = new TreeSet<>(new QtyComparator());
        productByQty.addAll(productSet);
        return productByQty;
    }

    public static void main(String[] args) {
        ProductRegistry productRegistry = new ProductRegistry();
        productRegistry.addProduct(1L, "Produto 5", 15d, 5);
        productRegistry.addProduct(2L, "Produto 0", 20d, 10);
        productRegistry.addProduct(1L, "Produto 3", 10d, 2);
        productRegistry.addProduct(9L, "Produto 9", 2d, 2);

        System.out.println(productRegistry.productSet);
        System.out.println(productRegistry.printProductsByName());
        System.out.println(productRegistry.printProductsByPrice());
        System.out.println(productRegistry.printProductsByQty());
    }
}
