import java.util.Scanner;

public class ConversorDeMoeda{
  //pode se inverter static public, mas nâo se pode inverter o void main 
  public static void main (String args[]){ 
    Scanner leitor = new Scanner(System.in);

    // declaração de variáveis
    float cotacaoDolar, quantidadeDeDolar;
    float valorEmReal;
    //entrada 
    System.out.println("Digite a cotação");
    cotacaoDolar = leitor.nextFloat();
    System.out.println("Digite a quantidade de dólares");
    quantidadeDeDolar = leitor.nextFloat();
    //processamento
     valorEmReal = quantidadeDeDolar * cotacaoDolar;
    

    // saída
    System.out.println("O resultado é: "+ valorEmReal);

  }
}