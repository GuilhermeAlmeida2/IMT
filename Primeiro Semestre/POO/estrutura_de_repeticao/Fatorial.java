public class Fatorial {
    public static void main(String args[]) {
        int a = 6 % 2;
        int n = 4;
        int i = 2;
        // n! = n* (n-1)8(n-2) *... *2*1(n>1)
        // 0!= 1
        // variável acumulativa
        int resultado = 1; // p*1 = p
        // manualmente
        resultado = resultado * 2; // 2
        resultado = resultado * 3; // 6
        resultado = resultado * 4;
        while (i <= n) {
            resultado = resultado * i;
            i++;
            // ++i;
            // i=i+1;
            // i+= 1;
        }
        System.out.println(resultado);
    }
}
