import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date data;
    private ArrayList<Produto> produtos;
    private Cliente cliente;

    public Pedido(Date data, ArrayList<Produto> produtos, Cliente cliente) {
        this.data = data;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double valorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }
}