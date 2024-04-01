import java.util.Scanner;;

public class VerificarPrimo {
    public static void main(String[] args) {
        // var: inferêcia de tipo(Java 10 ou superior)
        var leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        var valor = leitor.nextInt();
        // 1,2,3,4,5,6
        // 1,2,3,4,5,6,7
        // 2,3,4,5,6
        int cont = 2;
        for (; cont < valor;) {
            if (valor % cont == 0) {
                System.out.println("Não é primo");
                break;
            }
            cont++;

        }
        System.out.printf(String.format(cont == valor ? "É primo" : ""));
    }

}
