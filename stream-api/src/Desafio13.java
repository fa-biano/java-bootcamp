import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    // Desafio 13 - Filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10):
    private List<Integer> numeros;

    public Desafio13() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public List<Integer> filterNumListByParam(int num1, int num2) {
        List<Integer> filteredList = this.numeros.stream()
            .filter(num -> num >= num1 && num <= num2)
            .toList();

        return filteredList; 
    }

    public static void main(String[] args) {
        Desafio13 desafio13 = new Desafio13();
        System.out.println(desafio13.filterNumListByParam(5, 10));
    }
}
