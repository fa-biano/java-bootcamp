import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    // Desafio 3 - Verifique se todos os números da lista são positivos:
        private List<Integer> numeros;

    public Desafio3() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public boolean isAllPositiveNums() {
        boolean allPositiveNums = this.numeros.stream().allMatch(num -> num >= 0);
        return allPositiveNums;
    }

    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();
        System.out.println("Todos os números são positivos? Resposta: " + desafio3.isAllPositiveNums());
    }
}
