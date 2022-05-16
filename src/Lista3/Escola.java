package Lista3;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Funcionario> funcionarios =  new ArrayList<>();
    private List<Aluno> alunos =  new ArrayList<>();
    private List<Professor> professores =  new ArrayList<>();

    public void adicionaFuncionario(String nome, String cpf, String rg, String cargo, double salario){
        Funcionario funcionario = new Funcionario(nome,cpf,rg,cargo,salario);
        funcionarios.add(funcionario);
    }

    public void adicionaAluno(String nome, String cpf, String rg, int idade, String turma, int[] notasPorDisciplina){
        Aluno aluno = new Aluno(nome, cpf, rg ,idade , turma, notasPorDisciplina);
        alunos.add(aluno);
    }

    public void adicionaProfessor(String nome, String cpf, String rg, String cargo, double salario, String[] turmas, String[] disciplinas){
        Funcionario funcionario = new Professor(nome,cpf,rg,cargo,salario,turmas,disciplinas);
        professores.add((Professor) funcionario);
    }

    public void modificaAluno(String cpfParaPesquisa, String nome, String cpf, String rg, int age, String team, int[] notes){
        for (Aluno Aluno : alunos) {
            if (Aluno.getCpf().equals(cpfParaPesquisa)){
                Aluno.modificaAluno(nome, cpf, rg, age, team, notes);
            }
        }
    }

    public void modificafuncionario(String cpfParaPesquisa, String nome, String cpf, String rg, String cargo, double salario){
        for(Funcionario funcionario : funcionarios){
            if (funcionario.getCpf().equals(cpfParaPesquisa)){
                funcionario.modificaFuncionario(nome, cpf, rg, cargo, salario);
            }
        }
    }
    public void modificaProfessor(String cpfParaPesquisa,String nome, String cpf, String rg, String cargo, double salario, String[] turmas, String[] disciplinas){
        for (Professor professor : professores){
            if (professor.getCpf().equals(cpfParaPesquisa)){
                professor.modificaProfessor(nome, cpf, rg, cargo ,salario,turmas, disciplinas);
            }
        }
    }

    public void deletaAlunoPorCpf(String cpf){
        Aluno aux = null;
        for(Aluno Aluno : alunos){
            if(Aluno.getCpf().equals(cpf)) {aux = Aluno;}
        }
        if (aux!=null){alunos.remove(aux);}
    }

    public void deletaFuncionarioPorCpf(String cpf){
        Funcionario aux = null;
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getCpf().equals(cpf)) {aux = funcionario;}
        }
        if (aux!=null){funcionarios.remove(aux);}
    }

    public void deletaProfessorPorCpf(String cpf){
        Professor aux = null;
        for(Professor professor : professores){
            if(professor.getCpf().equals(cpf)) {aux = professor;}
        }
        if (aux!=null){professores.remove(aux);}
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos: ");
        for (Aluno Aluno : alunos) {
            System.out.println(Aluno);
        }
    }

    public void listarFuncionarios() {
        System.out.println("Lista de Funcionarios: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void listarProfessores(){
        System.out.println("Lista de Professores:");
        for (Professor professor: professores) {
            System.out.println(professor);
        }
    }


}
