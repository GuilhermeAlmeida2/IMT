
// import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Byte.parseByte;

public class TesteDeHabilitacao {
  public static void main (String args[]){
    // bytes (1byte), short(2bytes), int(4bytes), long(8bytes).
    // Byte é uma classe de alta problabilidade de uso
    //parseByte é membro de Byte
    // escreva o import static

    byte idade;
    showInputDialog("Qual a sua idade: "); //com o static fica somente o metodo
  idade = parseByte(showInputDialog("Qual a sua idade ☺"));

  if (idade >= 18){
    showMessageDialog(null,"sua você maior de idade");
  }
  else{
    showConfirmDialog(null,"você não pode dirigir ");
  }
  	//Operador ternario

      showConfirmDialog(
        null,
        idade >= 18 ? "Você pode dirigir" : "Você não pode dirigir");

  }
}