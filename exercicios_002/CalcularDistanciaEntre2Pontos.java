import java.util.Scanner;

public class CalcularDistanciaEntre2Pontos{
  static public void main(String args[]) {
    // indentação
    // declaração de variáveis
    Scanner leitor = new Scanner(System.in);
    float x1, x2, y1, y2;
    float dist; // dist é uma variável de saída.
    // entrada
    System.out.println("Digite x1");
    x1 = leitor.nextFloat();
    System.out.println("Digite x2");
    x2 = leitor.nextFloat();
    System.out.println("Digite y1");
    y1 = leitor.nextFloat();
    System.out.println("Digite y2");
    y2 = leitor.nextFloat();

      double d = 2.5f;

    // processamento
    dist = (float)Math.sqrt((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1, 2 ));
    // saída
    System.out.println("Distância: "+ dist);
    // A distancia entre p1(x1, y1) e p2(x2 ,y2) é: dist
    System.out.println("A distanca entre p1(" + ", " + y1 + ")e p2(" + x2 + ", " + y2 + ")é: "+ dist);
    System.out.printf(
      "A distancia entre p1 (%f, %.2f) e p2(%.2f, %.2f) é: %.2f", x1, y1, x2, y2, dist 
    );

    //   
  }
}