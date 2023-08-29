import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    // Desafio 4 - Remova todos os valores ímpares:
    private List<Integer> numeros;

    public Desafio4() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public List<Integer> removeOddNumbers() {
        List<Integer> oddNumsList = this.numeros.stream()
            .filter(num -> num % 2 == 0)
            .toList();
 
        return oddNumsList;
    }

    public static void main(String[] args) {
        Desafio4 desafio4 = new Desafio4();
        System.out.println(desafio4.removeOddNumbers());
    }
}
