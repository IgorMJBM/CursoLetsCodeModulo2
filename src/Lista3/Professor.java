package Lista3;

public class Professor extends Funcionario{
    private String[] turmas;
    private String[] disciplinas;


    public Professor(String nome, String cpf, String rg, String cargo, double salario, String[] turmas, String[] disciplinas) {
        super(nome, cpf, rg, cargo, salario);
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }



    public void modificaProfessor(String nome, String cpf, String rg, String cargo, double salario, String[] turma, String[] disciplina) {
        super.modificaFuncionario(nome, cpf, rg, cargo, salario);
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }

    private String imprimeDisciplinas(){
        StringBuilder disciplinasFinal = new StringBuilder();
        for (String disciplina : disciplinas) {
            disciplinasFinal.append(disciplina).append(" ");
        }
        return disciplinasFinal.toString();
    }

    private String imprimeTurmas(){
        StringBuilder turmasFinal = new StringBuilder();
        for (String turma : turmas) {
            turmasFinal.append(turma).append(" ");
        }
        return turmasFinal.toString();
    }



    @Override
    public String toString() {
        return "Professor{" +
                "turmas=" + imprimeTurmas() +
                ", disciplinas=" + imprimeDisciplinas() +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
