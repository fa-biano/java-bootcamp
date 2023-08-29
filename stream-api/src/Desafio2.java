import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    private List<Integer> numeros;

    public Desafio2() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public int sumEvenNums() {
        int evenSum = this.numeros.stream()
            .filter(num -> num % 2 == 0)
            .reduce(0, (num1, num2) -> num1 + num2);
        return evenSum;
    }

    public static void main(String[] args) {
        Desafio2 desafio2 = new Desafio2();
        System.out.println(desafio2.sumEvenNums());
    }
}
