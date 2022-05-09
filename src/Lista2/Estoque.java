package Lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {

    private int id;
    private String nome;
    private List<Produto> produtosEmEstoque = new ArrayList<>();
    private int contador = 1;


    Estoque(){

    }

    public Estoque(String nome) {
        this.id = contador;
        this.nome = nome;
        contador++;
    }


    public List<Produto> getProdutos() {
        return produtosEmEstoque;
    }

    public void criarProduto (String nome, String  sessao, String  tipo, String  marca, int quantityOnStock){
        if (verificarSeProdutoExiste(nome)){
            acharProduto(nome).adicionaQuantidadeEmEstoque(quantityOnStock);
        } else {
            var Produto = new Produto(nome, sessao, tipo, marca, quantityOnStock);
            produtosEmEstoque.add(Produto);
        }
    }

    public void imprimirTodosProdutos(){
        produtosEmEstoque.forEach(System.out::println);
    }

    public void imprimirProduto(long id){
        produtosEmEstoque.stream().filter(x -> x.getId() == id).forEach(System.out::println);
    }

    public void updateProduto(long id, String nome, String sessao, String tipo, String marca, int quantityOnStock){
        produtosEmEstoque.stream()
                .filter(x -> x.getId() == id)
                .map(x -> x.setNome(nome).setSessao(sessao).setTipo(tipo).setMarca(marca).adicionaQuantidadeEmEstoque(quantityOnStock))
                .forEach(System.out::println);
    }

    public void deletarProduto(long id){
        produtosEmEstoque.removeIf(x -> x.getId() == id);
        produtosEmEstoque.forEach(System.out::println);
    }

    private Produto acharProduto(String nome){
        return produtosEmEstoque.stream().filter(Produto -> Produto.getNome().equals(nome)).toList().get(0);
    }

    private boolean verificarSeProdutoExiste(String nome){
        return produtosEmEstoque.stream().anyMatch(Produto -> nome.equals(Produto.getNome()));
    }

    private void clearScannerBuffer(Scanner sc){
        if (sc.hasNextLine()){
            sc.nextLine();
        }
    }
}
