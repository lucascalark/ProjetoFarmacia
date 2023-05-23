
public class Funcionario {
    private String nomeFuncionario;
    private String cargo;
    private double salario;
    private String horarioTrabalho;

    public Funcionario(String nomeFuncionario, String cargo, double salario, String horarioTrabalho) {
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
        this.salario = salario;
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }
 
}


