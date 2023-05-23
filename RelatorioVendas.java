import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class RelatorioVendas {
    private List<Venda> vendas;
    private List<Produto> produtos;

    public RelatorioVendas(List<Venda> vendas, List<Produto> produtos) {
        this.vendas = vendas;
        this.produtos = produtos;
    }

    public void gerarRelatorio(Date dataInicial, Date dataFinal, String nomeArquivo) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo);
        writer.write("Relatório de vendas\n\n");

        for (Produto produto : produtos) {
            int totalVendas = 0;
            for (Venda venda : vendas) {
                if (venda.getDataVenda().after(dataInicial) && venda.getDataVenda().before(dataFinal) && venda.getProduto().equals(produto)) {
                    totalVendas += venda.getQuantidade();
                }
            }
            writer.write(produto.getNomeProduto() + ": " + totalVendas + " unidades vendidas\n");
        }

        writer.close();
    }
}