import javax.swing.JOptionPane;

public class ifSuasVariacoes {
  public static void main(String args[]) {
    // // declaração de variável
    final double NOTA_MAXIMA = 10;
    final double NOTA_MINIMA = 0;
    double notaFinal;

    // // entrada
    notaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final"));
    // // processamento
    // if (notaFinal >= 6) {
    // JOptionPane.showMessageDialog(null, "Aprovado");
    // JOptionPane.showMessageDialog((null), "Até logo");
    // }
    // else { //dangling else
    // JOptionPane.showMessageDialog(null, "De recuperação");
    // }
    // Encadeado
    if (notaFinal >= NOTA_MINIMA && notaFinal <= NOTA_MAXIMA) {
      if (notaFinal >= 9)// ; NO-OPERATION
      {
        JOptionPane.showMessageDialog(null, "Nota Final ☻☻", "Nota do Aluno", JOptionPane.INFORMATION_MESSAGE);
      } else if (notaFinal >= 8) {
        JOptionPane.showMessageDialog(null, "B");
      } else if (notaFinal >= 6) {
        JOptionPane.showMessageDialog(null, "C");
      } else {
        JOptionPane.showMessageDialog(null, "R");
      }
      JOptionPane.showMessageDialog(null, "Até logo");
    } else {
      JOptionPane.showMessageDialog(null, "Nota inválida");
      JOptionPane.showMessageDialog(null, "Até logo");
    }

  }
}
