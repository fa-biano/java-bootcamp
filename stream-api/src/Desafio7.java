import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {
            // Desafio 7 - Encontrar o segundo número maior da lista:
    private List<Integer> numeros;

    public Desafio7() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public int findSecondGreaterNum() {
        int secondGreater = this.numeros.stream()
            .sorted(Comparator.reverseOrder())
            .toList()
            .get(1);
        return secondGreater;
    }

    public static void main(String[] args) {
        Desafio7 desafio7 = new Desafio7();
        System.out.println("O segundo maior numero é " + desafio7.findSecondGreaterNum());
    }
}
