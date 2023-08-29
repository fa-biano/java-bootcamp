import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    private List<Integer> numeros;

    public Desafio9() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public boolean checkDistinct() {
        List<Integer> distinct = this.numeros.stream().distinct().toList();
        System.out.println(distinct);
        return distinct.equals(this.numeros);
    }

    public static void main(String[] args) {
        Desafio9 desafio9 = new Desafio9();
        System.out.println(desafio9.checkDistinct());
    }
}
