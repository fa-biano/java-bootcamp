import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoasTest {
    @BeforeAll
    // @BeforeEach
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou iniciarConexao");
    }

    @Test
    void validarAlgo() {
        Assertions.assertTrue(true);
    }
    
    @AfterAll
    // @AfterEach
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }
}
