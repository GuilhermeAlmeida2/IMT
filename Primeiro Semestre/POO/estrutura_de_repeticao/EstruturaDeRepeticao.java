import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class EstruturaDeRepeticao {
  public static void main(String args[]) {
    // Estrutura de Repetição
    // Variavel
    // double nota1, nota2;

    // While
    /*
     * int cont = 1;
     * while (cont <= 3) {
     * nota1 = parseDouble(showInputDialog("Digite a primeira nota: "));
     * nota2 = parseDouble(showInputDialog("Digite o segunda nota: "));
     * double media = (nota1 + nota2) / 2;
     * showMessageDialog(null, "Média desse aluno " + media);
     * cont = cont + 1;
     * }
     */

    // For
    /*
     * int numeroAlunos =
     * parseInt(showInputDialog("Digite a quantidade de alunos: "));
     * double mediaTotal = 0; // variavel acumulativa
     * for (int cont = 1; cont <= numeroAlunos; cont = cont + 1) {
     * nota1 = parseDouble(showInputDialog("Digite a primeira Nota: "));
     * nota2 = parseDouble(showInputDialog("Digite a segunda nota: "));
     * double media = (nota1 + nota2) / 2;
     * showMessageDialog(null, "A média desse aluno" + media);
     * mediaTotal = mediaTotal + media;
     * }
     * showMessageDialog(null, "Média alunos " + (mediaTotal / 2));
     */

     //Método Do While 
     int numeroAlunos;
     do {
      numeroAlunos= parseInt(showInputDialog("Quantos alunos? Digite valor positivo"));
     }while(numeroAlunos<= 0);
     showMessageDialog(null,"Ok, agora vamos começar... ");
  }
}