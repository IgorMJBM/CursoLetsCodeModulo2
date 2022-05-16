package Lista3;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected String rg;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void modificaFuncionario(String nome, String cpf, String rg, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
