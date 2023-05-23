public class Cliente {
    private String nomeCliente;
    private String endereco;
    private int telefone;
   
    public Cliente(String nomeCliente, String endereco, int telefone) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }    
}

