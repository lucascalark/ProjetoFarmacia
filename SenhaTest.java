import static org.junit.Assert.*;
import org.junit.*;  

public class SenhaTest {

    @Test
    public void testAutenticar() {
        Senha senha = new Senha(123456);

        boolean authenticated = senha.autenticar(123456);

       assertTrue(authenticated);

        authenticated = senha.autenticar(654321);

        assertFalse(authenticated);
    }
}