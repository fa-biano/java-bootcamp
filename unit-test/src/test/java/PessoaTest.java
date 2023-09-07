import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }
    
    @Test
    void validaSeEhMaiorDeIdade() {
        Pessoa pessoa1 = new Pessoa("Julia", LocalDate.of(1980, 1, 1));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
