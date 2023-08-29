import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    // Desafio 5 - Calcule a média dos números maiores que 5:
    private List<Integer> numeros;

    public Desafio5() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public double numbersGreaterThan5Average() {        
        double average = this.numeros.stream()
            .filter(num -> num > 5)
            // .mapToInt(Integer::intValue)
            .mapToInt(num -> Integer.valueOf(num))
            .average().orElse(0.0);

        // metodo avarege nao funciona com Objeto do tipo Integer entao precisamos transformar em tipo primitivo int

        System.out.println("avarege " + average);
        return average;
    }

    public static void main(String[] args) {
        Desafio5 desafio5 = new Desafio5();
        desafio5.numbersGreaterThan5Average();
    }
}
