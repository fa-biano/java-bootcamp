import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio18 {
    // Desafio 18 - Verifique se todos os números da lista são iguais:
    private List<Integer> numeros;

    public Desafio18() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
        // this.numeros = Arrays.asList(1, 1, 1, 1, 1, 1);
    }

    public boolean isAllNumsTheSame() {
        Set<Integer> numSet = new HashSet<>();
        this.numeros.forEach(num -> {
            numSet.add(num);
        });

        System.out.println(numSet);
        return numSet.size() == 1;
    }

    public static void main(String[] args) {
        Desafio18 desafio18 = new Desafio18();
        System.out.println("Todos os numeros da lista são iguais? " + desafio18.isAllNumsTheSame());
    }

}
