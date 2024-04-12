public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio. Não há pessoas para sair.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }

    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5);
        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();  // Tentando subir além do último andar
        elevador.descer();
        elevador.sair();
        elevador.sair();
        elevador.sair();  // Tentando sair sem pessoas no elevador
    }
}
