import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    
    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};
        int[] terceiroLancamento = {10, 20, 30, 40, 50};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertArrayEquals(primeiroLancamento, terceiroLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa1 = null;
        Assertions.assertNull(pessoa1);

        Pessoa pessoa2 = new Pessoa("Julia", LocalDate.now());
        Assertions.assertNotNull(pessoa2);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor1 = 5d;
        double valor2 = 5d;

        Assertions.assertEquals(valor1, valor2);
    }
}
