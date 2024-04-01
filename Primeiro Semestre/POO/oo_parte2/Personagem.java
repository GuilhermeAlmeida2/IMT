public class Personagem {

    // váriaveis de (insância é sinônimo de objeto)
    String nome;
    private int energia = 10, fome = 0, sono = 0;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " Caçando");
            energia = energia - 2; // energia -= 2;
        } else {
            System.out.printf("%s você não tem energia suficiente para caçar\n", nome);
            fome = Math.min(fome + 1, 10);
            sono = sono == 10 ? sono : sono + 1;
        }

    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " Dormindo...");
            sono--; // --sono; //sono = sono -1; // sono -= 1;
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.println(nome + "sem sono");
        }
    }

    // método de instânciar
    void comer() {
        // lógica em queda (fall-through)
        switch (fome) {
            case 0:
                System.out.println(nome + "sem fome");
                break;
            default:
                System.out.println(nome + "comendo");
                --fome;
        }

    }

}