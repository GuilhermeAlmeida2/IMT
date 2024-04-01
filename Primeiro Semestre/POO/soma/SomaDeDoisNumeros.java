import javax.swing.JOptionPane;
public class SomaDeDoisNumeros{
    public static void main(String [] args){
         //declaração de variável 
         double primeiroValor;
         double segundoValor;
         double resultado;
         //entrada de Dados
          //classe utilitária chamada Double (empacotadora (wrapper))
          primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primetio Valor"));
          segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));

        //Processamento 
        resultado = primeiroValor +segundoValor;
        //Saída 
        JOptionPane.showMessageDialog(null, resultado);

        //Utilizando String.format
        String exibir = String.format("%f + %f = %f ", primeiroValor, segundoValor, resultado);
        JOptionPane.showMessageDialog(null, exibir);


    }
}