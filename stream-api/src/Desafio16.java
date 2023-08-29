import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    // Desafio 16 - Agrupe os números em pares e ímpares:
    private List<Integer> numeros;

    public Desafio16() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public void groupByOddaAndEven() {
        List<Integer> oddList = this.numeros.stream().filter(num -> num % 2 == 0).toList();
        List<Integer> evenList = this.numeros.stream().filter(num -> num % 2 != 0).toList();

        System.out.print("Grupo de Numeros Pares ");
        System.out.println(oddList);
        
        System.out.print("Grupo de Numeros Impares ");
        System.out.println(evenList);
    }

    public static void main(String[] args) {
        Desafio16 desafio16 = new Desafio16();
        desafio16.groupByOddaAndEven();
    }
}
