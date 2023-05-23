public class Gerente {
    private Senha senha;

    public Gerente(Senha senha) {
        this.senha = senha;
    }

    public void removerCliente(String nomeCliente, int senhaDigitada) {
        if (this.senha.autenticar(senhaDigitada)) {
            // Remover cliente
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}