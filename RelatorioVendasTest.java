import static org.junit.Assert.*;
import org.junit.*;  
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class RelatorioVendasTest {

    private List<Venda> vendas;
    private List<Produto> produtos;

    @Before
    public void setup() {
        vendas = new ArrayList<>();
        produtos = new ArrayList<>();

        produtos.add(new Produto("Produto A", "Alimento"));
        produtos.add(new Produto("Produto B", "Alimento"));
        produtos.add(new Produto("Produto C", "Alimento"));

        vendas.add(new Venda(getDate(2023, 4, 15), produtos.get(0), 10));
        vendas.add(new Venda(getDate(2023, 4, 16), produtos.get(0), 5));
        vendas.add(new Venda(getDate(2023, 4, 17), produtos.get(1), 8));
        vendas.add(new Venda(getDate(2023, 4, 18), produtos.get(1), 15));
        vendas.add(new Venda(getDate(2023, 4, 19), produtos.get(2), 3));
    }

    @Test
    public void testGerarRelatorio() throws IOException {
        RelatorioVendas relatorio = new RelatorioVendas(vendas, produtos);

        Date dataInicial = getDate(2023, 4, 16);
        Date dataFinal = getDate(2023, 4, 19);
        String nomeArquivo = "relatorio.txt";

        relatorio.gerarRelatorio(dataInicial, dataFinal, nomeArquivo);

        String reportContent = readReportFile(nomeArquivo);

        String expectedReportContent = "Relatório de vendas\n\n" +
                "Produto A: 5 unidades vendidas\n" +
                "Produto B: 23 unidades vendidas\n" +
                "Produto C: 3 unidades vendidas\n";

       assertEquals(expectedReportContent, reportContent);
    }

    private String readReportFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
  
      private Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); 
        return calendar.getTime();
    }
}