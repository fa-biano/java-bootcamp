import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio17 {
    // Desafio 17 - Filtrar os números primos da lista:
    private List<Integer> numeros;

    public Desafio17() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    private boolean isPrimeNum(int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }

    public List<Integer> findGreaterPrimeNum() {
        List<Integer> greaterPrimeNum = this.numeros.stream()
            .filter(num -> isPrimeNum(num))
            .toList();
        return greaterPrimeNum;
    }

}
