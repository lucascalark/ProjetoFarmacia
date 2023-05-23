public class Senha {
    private int senha;

    public Senha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}

