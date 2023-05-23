import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Date;

public class PedidoTest {

  private Pedido pedido;
  private ArrayList<Produto> produtos;

  @Before
  public void setup() {
    produtos = new ArrayList<>();
    produtos.add(new Produto("Produto A", "Categoria A"));
    produtos.add(new Produto("Produto B", "Categoria B"));
    produtos.add(new Produto("Produto C", "Categoria C"));

    pedido = new Pedido(new Date(), produtos, new Cliente("Malena", "Patos", 123456789));
  }

  @Test
  public void testValorTotal() {
    double expectedTotal = 0;
    for (Produto produto : produtos) {
      expectedTotal += produto.getValor();
    }

    double actualTotal = pedido.valorTotal();

    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testSetData() {
    Date newData = new Date();

    pedido.setData(newData);

    Date updatedData = pedido.getData();

    assertEquals(newData, updatedData);
  }

}
