import java.util.Scanner;

public class SistemaFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farmacia farmacia = new Farmacia();

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Exibir estoque");
            System.out.println("3. Comprar produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidadeProduto = scanner.nextInt();

                    Produto novoProduto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
                    farmacia.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    farmacia.exibirEstoque();
                    break;

                case 3:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.next();
                    Cliente cliente = new Cliente(nomeCliente);

                    System.out.print("Nome do produto a comprar: ");
                    String nomeProdutoCompra = scanner.next();
                    Produto produtoComprado = farmacia.buscarProdutoPorNome(nomeProdutoCompra);

                    if (produtoComprado != null) {
                        System.out.print("Quantidade a comprar: ");
                        int quantidadeCompra = scanner.nextInt();

                        if (quantidadeCompra <= produtoComprado.getQuantidade()) {
                            produtoComprado.exibirInformacoesDetalhadas(quantidadeCompra);
                            produtoComprado.setQuantidade(produtoComprado.getQuantidade() - quantidadeCompra);
                        } else {
                            System.out.println("Quantidade em estoque insuficiente.");
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema. Até mais!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
