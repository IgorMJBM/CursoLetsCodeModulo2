package Lista2;

public class Produto {

    private int id;
    private int contador;
    private String nome;
    private String sessao;
    private String tipo;
    private String marca;
    private int quantidadeEmEstoque;

    public Produto(String nome, String sessao, String tipo, String marca, int quantidadeEmEstoque) {
        this.id = contador;
        contador++;
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome += nome;
        return this;
    }

    public Produto setId(int id) {
        this.id = id;
        return this;
    }

    public Produto setSessao(String sessao) {
        this.sessao = sessao;
        return this;
    }

    public Produto setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Produto setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public Produto adicionaQuantidadeEmEstoque(int quantidade){
        this.quantidadeEmEstoque += quantidade;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sessao='" + sessao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Produto produto)){
            return false;
        }
        return getNome().equals(produto.getNome());
    }
}
