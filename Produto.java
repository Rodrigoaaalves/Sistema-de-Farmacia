public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
  
    public void exibirInformacoesDetalhadas(int quantidadeComprada) {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Quantidade comprada:" + quantidadeComprada + " por este cliente(s)");
    }
    
    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade = novaQuantidade;
        } else {
            System.out.println("Quantidade não pode ser negativa.");
        }
    }
}
