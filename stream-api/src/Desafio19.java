import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    private List<Integer> numeros;

    public Desafio19() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public int divisibleBy3And5Sum() {
        int totalSum = this.numeros.stream()
            .filter(num -> num % 3 == 0 || num % 5 == 0)
            .reduce(0, (num1, num2) -> num1 + num2);

        return totalSum;
    }

    public static void main(String[] args) {
        Desafio19 desafio19 = new Desafio19();
        System.out.println(desafio19.divisibleBy3And5Sum());
    }
}
