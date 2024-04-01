public class ExibirNaturais {
    public static void main(String args[]) {
        // System.out.println(1)
        // System.out.println(2)
        // System.out.println(3)
        // System.out.println(4)
        // System.out.println(5)
        // 3 partes
        // declaração/inicialização
        // teste de continueidade
        // atualização/incremento
        int a = 1;
        a = a + 1;
        a += 1;
        // ou
        a++;
        ++a;

        for (int cont = 5; cont >= 1; cont = cont--) {
            System.out.println(cont);
        }
    }
}