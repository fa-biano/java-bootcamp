import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "seuUsuario")
    void validacao1() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validacao2() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validacao3() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void validacao4() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void validacao5() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validacao6() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_17)
    void validacao7() {
        Assertions.assertEquals(10, 5+5);
    }
}
