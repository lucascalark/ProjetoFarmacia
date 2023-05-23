import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testGetNomeCliente() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        String nomeCliente = cliente.getNomeCliente();

        assertEquals("Malena", nomeCliente);
    }

    @Test
    public void testSetNomeCliente() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        cliente.setNomeCliente("Barbara");

        String nomeCliente = cliente.getNomeCliente();

        assertEquals("Barbara", nomeCliente);
    }

    @Test
    public void testGetEndereco() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        String endereco = cliente.getEndereco();

        assertEquals("Patos", endereco);
    }

    @Test
    public void testSetEndereco() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        cliente.setEndereco("Joao Pessoa");

        String endereco = cliente.getEndereco();

        assertEquals("Joao Pessoa", endereco);
    }

    @Test
    public void testGetTelefone() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        int telefone = cliente.getTelefone();

        assertEquals(123456789, telefone);
    }

    @Test
    public void testSetTelefone() {
        Cliente cliente = new Cliente("Malena", "Patos", 123456789);

        cliente.setTelefone(987654321);

        int telefone = cliente.getTelefone();

        assertEquals(987654321, telefone);
    }
}
