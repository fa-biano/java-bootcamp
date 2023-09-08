import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void cenarioDeExcecaoParaMesada() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.now());
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> pessoa.definirMesada(0));
    }
}
