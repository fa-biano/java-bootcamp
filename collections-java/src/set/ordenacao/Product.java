package set.ordenacao;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name;
    private long code;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
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

    public Product(String name, long code, double price, int qty) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (code ^ (code >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", code=" + code + ", price=" + price + ", qty=" + qty + "]";
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }
}

class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

class QtyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getQty(), p2.getQty());
    }
}
