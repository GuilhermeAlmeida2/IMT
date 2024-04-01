import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;

public class ListadeExercicio21 {
    public static void main(String[] args) {
        double soma = 0; // acumulador
        long quantidadeDigitaos = 0; // acumulador, também contador
        double media = 0;// acumulador
        double maior = -1;
        double menor = -1;
        double mediaPares = 0;
        double percemtialImpares = 0;
        double valorDigitado;
        do {
            valorDigitado = parseDouble(
                    showInputDialog("Digite o valor"));
            if (valorDigitado != 30000) {
                soma += valorDigitado; // soma= soma+valorDigitado;
                ++quantidadeDigitaos;
                media = media + valorDigitado;
            }
        } while (valorDigitado != 30000);

    }
}
