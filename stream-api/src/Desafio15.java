import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    private List<Integer> numeros;

    public Desafio15() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public boolean negativeNumExists() {
        boolean negativeExists = this.numeros.stream().anyMatch(num -> num < 0);
        return negativeExists;
    }

    public static void main(String[] args) {
        Desafio15 desafio15 = new Desafio15();
        System.out.println("Existe algum numero negatio na lista ? " + desafio15.negativeNumExists());
    }
}
