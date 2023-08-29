import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    private List<Integer> numeros;

    public Desafio11() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public int numListSquareSum() {
        int totalSquareSum = this.numeros.stream().mapToInt(num -> num * num).sum();
        return totalSquareSum;
    }

    public static void main(String[] args) {
        Desafio11 desafio11 = new Desafio11();
        System.out.println(desafio11.numListSquareSum());
    }
}
