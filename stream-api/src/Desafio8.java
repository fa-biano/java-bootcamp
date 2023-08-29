import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    // Desafio 8 - Somar os dígitos de todos os números da lista:
    private List<Integer> numeros;

    public Desafio8() {
        this.numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);
    }

    public int sumNumsDigit() {
        int total = this.numeros.stream()
            .mapToInt(num -> num.toString().length())
            .sum();

        return total;
    }

    public void printNumSize() {
        System.out.println(this.numeros.size());
    }

    public static void main(String[] args) {
        Desafio8 desafio8 = new Desafio8();
        desafio8.printNumSize();
        System.out.println("Soma dos digitos dos numeros da lista é " + desafio8.sumNumsDigit());
    }
}
