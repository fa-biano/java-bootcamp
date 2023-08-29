import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio14 {
    // Desafio 14 - Encontre o maior número primo da lista:
    private List<Integer> numeros;

    public Desafio14() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    private boolean isPrimeNum(int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }

    public int findGreaterPrimeNum() {
        int greaterPrimeNum = this.numeros.stream()
            .filter(num -> isPrimeNum(num))
            .mapToInt(num -> Integer.valueOf(num))
            .max().orElse(0);
        return greaterPrimeNum;
    }

    public static void main(String[] args) {
        Desafio14 desafio14 = new Desafio14();
        System.out.println(desafio14.findGreaterPrimeNum());
    }
}
