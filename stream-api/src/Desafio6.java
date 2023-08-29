import java.util.Arrays;
import java.util.List;

public class Desafio6 {
        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
    private List<Integer> numeros;

    public Desafio6() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public boolean isAnyGreaterthan10() {
        boolean anyGreaterThan10 = this.numeros.stream().anyMatch(num -> num > 10);
        return anyGreaterThan10;
    }

    public static void main(String[] args) {
        Desafio6 desafio6 = new Desafio6();
        System.out.println("Existe algum numero maior que 10 na Lista? Resposta: " + desafio6.isAnyGreaterthan10());
    }
}
