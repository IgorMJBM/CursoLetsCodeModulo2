package Lista3;

public class TesteEscola {
    public static void main(String[] args) {
        Escola escola = new Escola();

        System.out.println("===============TEST CREATE STUDENT METHOD===============");
        escola.adicionaAluno("Andrew", "xxx", "yyy", 20, "Class A", new int[]{7, 8, 9, 10, 8});
        escola.adicionaAluno("Liz", "www", "zzz", 25, "Class A", new int[]{8, 8, 9, 10, 10});
        escola.listarAlunos();
        System.out.println("\n===============TEST UPDATE STUDENT METHOD===============");
        escola.modificaAluno("xxx", "Andrew", "xxx", "yyy", 20, "Class B", new int[]{10, 10, 10, 10, 10});
        escola.listarAlunos();
        System.out.println("\n===============TEST DELETE STUDENT METHOD===============");
        escola.deletaAlunoPorCpf("xxx");
        escola.listarAlunos();
        System.out.println("========================================================");

        System.out.println("\n===============TEST CREATE EMPLOYEE METHOD===============");
        escola.adicionaFuncionario("Gerald", "ppp", "ooo", "Director", 2600.89);
        escola.adicionaFuncionario("Vanda", "uuu", "ttt", "Coordinator", 2790.80);
        escola.listarFuncionarios();
        System.out.println("\n===============TEST UPDATE EMPLOYEE METHOD===============");
        escola.modificafuncionario("ppp", "Gerald", "lll", "ooo", "Director", 2499.90);
        escola.listarFuncionarios();
        System.out.println("\n===============TEST DELETE EMPLOYEE METHOD===============");
        escola.deletaFuncionarioPorCpf("uuu");
        escola.listarFuncionarios();
        System.out.println("========================================================");
        
        System.out.println("\n===============TEST CREATE PROFESSOR METHOD===============");
        escola.adicionaProfessor("Rodolfo", "aaa", "bbb", "profesor",2500.89,new String[]{"Class A", "Class B"}, new String[]{"portugues","ingles"});
        escola.adicionaProfessor("Joao", "ccc", "ddd", "profesor",2500.68, new String[]{"Class C", "Class D"}, new String[]{"matematica","fisica"});
        escola.listarProfessores();
        System.out.println("\n===============TEST UPDATE PROFESSOR METHOD===============");
        escola.modificaProfessor("aaa","Rodolfo", "eee", "fff", "profesor",2500.89,new String[]{"Class c", "Class d"}, new String[]{"portugues","ingles"});
        escola.listarProfessores();
        System.out.println("\n===============TEST DELETE PROFESSOR METHOD===============");
        escola.deletaProfessorPorCpf("ccc");
        escola.listarProfessores();
        System.out.println("========================================================");
    }
}
