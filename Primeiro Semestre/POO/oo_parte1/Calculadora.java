public class Calculadora {
    // tipo de retorno, nome, lista de parâmetros e corpo
    // há métodos que:
    // 1. produzem um valor e o disponibilizam
    // 2. que causam um efeito colateral

    int somar(int a, int b) {
        // int a = 2;
        // int b = 3;
        // int resultado = a + b;
        return a + b;
        // System.out.println(resultado);
    }

    void subtrair() {
        int a = 3;
        int b = 2;
        int resultado = a - b;
        System.out.println(resultado);
    }
}