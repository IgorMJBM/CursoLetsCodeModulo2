package Lista3;

import java.util.Arrays;
import java.util.Map;

public class Aluno {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String turma;
    private int[] notasPorDisciplina;

    public Aluno(String nome, String cpf, String rg, int idade, String turma, int[] notasPorDisciplina) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.turma = turma;
        this.notasPorDisciplina = notasPorDisciplina;
    }


    public void modificaAluno(String nome, String cpf, String rg, int idade, String turma, int[] notasPorDisciplina) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.turma = turma;
        this.notasPorDisciplina = notasPorDisciplina;
    }


    private String imprimeNotas(){
        StringBuilder notas = new StringBuilder();
        for (int nota : notasPorDisciplina) {
            notas.append(nota).append(" ");
        }
        return notas.toString();
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", idade=" + idade +
                ", turma='" + turma + '\'' +
                ", notasPorDisciplina=" + imprimeNotas() +
                '}';
    }

    public String getCpf() {
        return cpf;
    }
}
