import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    // Desafio 12 - Encontre o produto de todos os números da lista:
    private List<Integer> numeros;

    public Desafio12() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
        // this.numeros = Arrays.asList(1, 2, 3, 4);
    }

    public int numListTotalProduct() {
        int totalProduct = this.numeros.stream().reduce(1, (num1, num2) -> num1 * num2);
        return totalProduct;
    }

    public static void main(String[] args) {
        Desafio12 desafio12 = new Desafio12();
        System.out.println(desafio12.numListTotalProduct());
    }
}
