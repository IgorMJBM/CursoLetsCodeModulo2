package Lista1;


import java.time.LocalDate;
import java.util.Random;

public class Jogador {

    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelos;
    private int cartaoVermelho;
    private boolean suspenso;

    private int quantidadeTreinoAntesDaPartida;

    public Jogador(){

    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = verificarCondiçaoDeJogo();
    }

    public boolean verificarCondiçaoDeJogo(){
        if (this.cartoesAmarelos >= 3){
            System.out.println("NÃO PODE JOGAR O MESMO ESTÁ SUSPENSO!");
            suspenso = true;
        } else if (this.cartaoVermelho == 1) {
            System.out.println("NÃO PODE JOGAR O MESMO ESTÁ SUSPENSO!");
            suspenso = true;
        } else {
            System.out.println("APTO A JOGAR!");
            suspenso = false;
        }
        return suspenso;
    }

    public int aplicarCartaoAmarelo(int quantidadeCartoes){
        this.cartoesAmarelos += quantidadeCartoes;
        if (cartoesAmarelos >= 3){
            this.suspenso = true;
            System.out.println("Jogador suspenso!");
        }else {
            System.out.println("Jogador possui " + cartoesAmarelos + " cartões amarelos!");
        }
        return 0;
    }

    public void aplicarCartaoVermelho(){
        this.suspenso = true;
        System.out.println("Jogador suspenso!");
    }

    public void cumprirSuspensao(){
        this.cartoesAmarelos = 0;
        this.cartaoVermelho = 0;
        this.suspenso = false;
        System.out.println("Jogador cumpriu sua suspenção, portanto não está mais suspenso!");
    }


    public void sofrerLesao(){
        Random random = new Random();
        int probabilidadePerdaQualidade = random.nextInt(100);
        if (probabilidadePerdaQualidade <= 4){
            qualidade = (int) (qualidade - (qualidade * 0.15));
        } else if (probabilidadePerdaQualidade <= 14) {
            qualidade = (int) (qualidade - (qualidade * 0.10));
        } else if (probabilidadePerdaQualidade <= 29) {
            qualidade = (int) (qualidade - (qualidade * 0.05));
        } else if (probabilidadePerdaQualidade <= 59){
            if (qualidade <= 2){
                qualidade -= 2;
            }else {
                if (qualidade <= 1){
                    qualidade -=1;
                }
            }
        }
    }

    public void executarTreinamento(){
        Random random = new Random();
         int aumentoQualidade = random.nextInt(2) + 1;
        if (quantidadeTreinoAntesDaPartida == 1){
            System.out.println("Já foi feito treino antes da partida!");
        }else {
            qualidade += aumentoQualidade;
            System.out.println("Jogador treinou, e aumento sua qualidade em " + aumentoQualidade + " pontos!");
        }
        quantidadeTreinoAntesDaPartida++;
    }

    @Override
    public String toString() {
        if (!suspenso && cartoesAmarelos < 3 && cartaoVermelho == 0) {
            return posicao + ": " + id + " - " + nome + " ("+ apelido +") " + " - " + dataNascimento + " CONDITION: CAN PLAY";
        }
        return posicao + ": " + id + " - " + nome + " ("+ apelido +") " + " - " + dataNascimento + " CONDITION: CAN NOT PLAY";
    }
}

