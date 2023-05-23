
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  private static String nomeCliente;

  public static void main(final String[] args) {
     List<Cliente> clientes = new ArrayList<>();
     List<Produto> produtos = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     Scanner input = new Scanner(System.in);
     boolean continua = true;
     Senha senha = new Senha(1234);
     Gerente gerente = new Gerente(senha);
 
    int opcao = -1;

        while (opcao != 0) {
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("   [Farmácia PROJETO]     ");
            System.out.println("--------------------------");
            System.out.println("Olá! Bem Vindo ao Sistema ");
            System.out.println("--------------------------");
            System.out.println("      O que você é?       ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("   Escolha uma opção: ");
            System.out.println("");
            
            System.out.println("1 - Cliente");
            System.out.println("2 - Funcionario");
           

            
            opcao = input.nextInt();

            switch (opcao) {
              case 1:
              System.out.println("");
              System.out.println("---------------------");
              System.out.println("Pagina do Cliente");
              System.out.println("---------------------");
              System.out.println("Escolha uma opção:");
              System.out.println("");
              System.out.println("1 - Efetuar Cadastro");
              System.out.println("2 - Imprimir lista de produtos");
              System.out.println("0 - Voltar");
              int opcao1 = input.nextInt();
              switch (opcao1) {
                  case 1:
                      // CADASTRO DO CLIENTE
                      System.out.println("");
                      System.out.println("Digite o Seu Nome:");
                      nomeCliente = scanner.nextLine();
            
                      System.out.println("Digite o seu endereço ");
                      String endereco = scanner.nextLine();
            
                      System.out.println("Digite o seu telefone ");
                      int telefone = scanner.nextInt();
            
                      // Criar cliente
                      Cliente novoCliente = new Cliente(nomeCliente, endereco, telefone);
            
                      // Adicionar cliente à lista
                      clientes.add(novoCliente);

                      System.out.println("");
                      System.out.println("Cliente adicionado com sucesso!");
                      
            
                      break;
                  case 2:
                      // LISTA DE PRODUTOS DISPONIVEIS
                      for (final Produto produto : produtos) {
                        System.out.println("Nome do Produto: " + produto.getNomeProduto());
                        System.out.println("Categoria: " + produto.getCategoria());
                        System.out.println("Estoque: " + produto.getEstoque());
                        System.out.println();
                      }
                      break;
                  case 0:
                      System.out.println("Voltando...");
                      break;
            
                  default:
                      System.out.println("Opção inválida!");
                      break;
              }
              break;

                    
                    
              case 2:
              int opcao2 = -1;
              while (opcao2 != 0) {
                  System.out.println("");
                  System.out.println("---------------------");
                  System.out.println("Pagina do Funcionario");
                  System.out.println("---------------------");
                  System.out.println("Escolha uma opção:");
                  System.out.println("");
                  System.out.println("1 - Remover Cliente");
                  System.out.println("2 - Imprimir lista de clientes");
                  System.out.println("3 - Adicionar Produto ao Sistema");
                  System.out.println("4 - Remover produto");
                  System.out.println("0 - Voltar");

                  opcao2 = input.nextInt();

                  switch (opcao2) {
                      case 1:
                          // REMOVER CLIENTE
                          // senha para remover cliente ( senha: 1234 )
                          System.out.println("Olá, digite a senha necessária para essa opção");
                          int senhaDigitada = scanner.nextInt();
                          if (senhaDigitada == 1234) {
                            System.out.println("Digite o nome do cliente a ser removido:");
                            scanner.nextLine();
                            final String nomeRemover = scanner.nextLine();
                            boolean encontrado = false;
                            for (int i = 0; i < clientes.size(); i++) {
                              final Cliente cliente = clientes.get(i);
                              if (cliente.getNomeCliente().equals(nomeRemover)) {
                                clientes.remove(i);
                                encontrado = true;
                                System.out.println("Cliente removido com sucesso.");
                          break;
                        }
                      }
                      if (!encontrado) {
                        System.out.println("Cliente não encontrado na lista.");
                      }
                    } else {
                      System.out.println("Opção inválida.");
                    }
                    break;
                      case 2:
                          // imprimir lista de clientes
                          for (final Cliente cliente : clientes) {

                            System.out.println("Nome: " + cliente.getNomeCliente());
                            System.out.println("Endereço: " + cliente.getEndereco());
                            System.out.println("Telefone: " + cliente.getTelefone());
                            System.out.println();
                          }
                          break;
                      case 3:
                          // Produtos no sistema

                          System.out.println("Digite o nome do produto:");
                          String nomeProduto = scanner.next();
                          System.out.println("Digite a categoria do produto:");
                          String categoria = scanner.next();
                          Produto novoProduto = new Produto(nomeProduto, categoria);
                          produtos.add(novoProduto);
                          System.out.println("");
                          System.out.println("Produto adicionado com sucesso.");
                          break;
                      case 4:
                          // Código para a subopção 4 da Opção 2
                           
                           System.out.println("Digite o nome do produto a ser removido:");
                           String nomeRemoverProduto = scanner.next();
                           boolean encontradoProduto = false;
                           for (int i = 0; i < produtos.size(); i++) {
                               Produto produto = produtos.get(i);
                               if (produto.getNomeProduto().equals(nomeRemoverProduto)) {
                                   produtos.remove(i);
                                   encontradoProduto = true;
                                   System.out.println("Produto removido com sucesso.");
                                   break;
                               }
                           }
                           if (!encontradoProduto) {
                               System.out.println("Produto não encontrado na lista.");
                           }
                           break;

                        
                      case 0:
                          System.out.println("Voltando...");
                          break;
                      default:
                          System.out.println("Opção inválida!");
                          break;
                  }
              }
              break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}