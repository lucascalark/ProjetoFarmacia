import java.util.Date;
class Venda {
    private Date dataVenda;
    private Produto produto;
    private int quantidade;

    public Venda(Date dataVenda, Produto produto, int quantidade) {
        this.dataVenda = dataVenda;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
