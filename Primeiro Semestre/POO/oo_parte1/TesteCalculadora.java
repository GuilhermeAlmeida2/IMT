public class TesteCalculadora {
    public static void main(String args[]) {
        System.out.println("Começando...");
        Calculadora calc = new Calculadora();
        int res1 = calc.somar(5, 4);
        int res2 = calc.somar(3, 2);
        System.out.println(res1);
        System.out.println(res2);
        calc.subtrair();
        System.out.println("Terminando...");

    }
}
