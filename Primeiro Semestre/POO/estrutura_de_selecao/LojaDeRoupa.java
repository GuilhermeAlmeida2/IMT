// import java.util.Scanner;
public class LojaDeRoupa {
  public static void main(String args[]) {
    // declaração de variáveis
    double valorDaRoupa;
    int opcao;
    // inferência de tipo (feito pelo compilador) (a partir do Java 10)
    var leitor = new java.util.Scanner(System.in);
    // entrada
    System.out.println("Digite o valor da roupa:");
    valorDaRoupa = leitor.nextDouble();
    System.out.println("0-A vista\n1-Cartao\n2-Crediario");
    opcao = leitor.nextInt();
    // processamento
    // switch/case
    switch (opcao) {
      case 0:
        System.out.println("Valor a vista: " + valorDaRoupa * 0.9);
        break;
      case 1: {
        System.out.println("Quantas parcelas?");
        var numeroParcelas = leitor.nextInt();
        System.out.println("Valor da parcela: " + valorDaRoupa / numeroParcelas);
        break;
      }
      case 2: {
        System.out.println("Quantas parcelas?");
        var numeroParcelas = leitor.nextInt();
        valorDaRoupa = valorDaRoupa*1.1;
        System.out.printf( "Valor Total: %2.f. valor da parcela %.2f\n", 
        valorDaRoupa, valorDaRoupa/numeroParcelas
        );
        break;
      }
      default:
        System.out.println("Opção invalida");
        break;
    }

    // saída

  }
}