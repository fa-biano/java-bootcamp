import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    private List<Integer> numeros;

    public Desafio10() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public List<Integer> groupOddAndDivibleBy3And5() {
        List<Integer> oddNumList = this.numeros.stream()
            .filter(num -> num % 2 != 0)
            .toList();

        List<Integer> divibleBy3And5 = oddNumList.stream()
            .filter(num -> num % 3 == 0 || num % 5 == 0)
            // .distinct()
            .toList();
        
        // List<Integer> oddAndDivibleBy3And5 = this.numeros.stream()
        //     .filter(num -> num % 2 != 0)
        //     .filter(num -> num % 3 == 0 || num % 5 == 0)
        //     .toList();

        // return oddAndDivibleBy3And5;
        return divibleBy3And5;
    }

    public static void main(String[] args) {
        Desafio10 desafio10 = new Desafio10();
        System.out.println(desafio10.groupOddAndDivibleBy3And5());
    }
}
