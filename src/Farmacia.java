import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Produto> estoque = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void exibirEstoque() {
        System.out.println("----- Estoque da Farmácia -----");
        for (Produto produto : estoque) {
            produto.exibirInformacoes();
            System.out.println("---------------------------");
        }
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
