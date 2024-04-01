import java.util.Scanner;
import static java.lang.Math.pow;

public interface Enroscado {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Digite o número de termos:");
        double total;// acumulador;p+0=p
        total = 5;
        total = 7;
        // btyes(1bytes), short(2bytes), int(4bytes), long(8bytes)
        long numeroTermo = leitor.nextLong();
        // boolean variavel que armazena True ou False
        System.out.println("Qual o valor de x");
        long x = leitor.nextLong();
        boolean incrementandoDenominador = true;
        int denominador = 1;
        for (int i = 1; i <= numeroTermo; i++) {
            if (denominador == 4)
                incrementandoDenominador = false;
            else if (denominador == 1)
                incrementandoDenominador = true;

            long fatorial = 1; // 1*2*...*denominador
            for (long j = 1; j <= denominador; j++)
                fatorial *= j; // fatorial = fatorial *j;

            double fracao = pow(-x, 2) / (double) fatorial; // vai tratar o long fatorial como double (casting)
            total = total + (i % 2 == 1? fracao*1-1:fracao);



            if (incrementandoDenominador)
                denominador++;
            else
                denominador--;
        }
        System.out.println("Resultado: "+(total *-1));
    }
}
