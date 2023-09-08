import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.MethodName.class)  // Irá realizar o teste por ordem alfabetica dos metodos;
// @TestMethodOrder(MethodOrderer.Random.class) // Irá realizar o teste por ordem random;
// @TestMethodOrder(MethodOrderer.DisplayName.class) // Irá realizar o teste por ordem alfabetica do displayName;
public class EscolhendoOrdemDoTest {

    @Order(4)
    // @DisplayName("A") // retirar a tag Order
    @Test
    void validacaoA() {
        Assertions.assertTrue(true);
    }
    
    @Order(3)
    // @DisplayName("C") // retirar a tag Order
    @Test
    void validacaoB() {
        Assertions.assertTrue(true);
    }
    
    @Order(2)
    // @DisplayName("B") // retirar a tag Order
    @Test
    void validacaoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validacaoD() {
        Assertions.assertTrue(true);
    }
}
