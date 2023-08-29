// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio1 {
    // Desafio 1 - Mostre a lista na ordem numérica:
    private List<Integer> numeros;

    public Desafio1() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public List<Integer> sortNum() {
        // List<Integer> orderedNums = new ArrayList<>(this.numeros);
        // orderedNums.sort((num1, num2) -> Integer.compare(num1, num2));        
      
        List<Integer> orderedNums = this.numeros.stream()
            .sorted(Comparator.naturalOrder())
            .toList();
        return orderedNums;
    }

    public void printNums() {
        System.out.println(this.numeros);
    }

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        System.out.println(desafio1.sortNum());
        desafio1.printNums();
    }
}
