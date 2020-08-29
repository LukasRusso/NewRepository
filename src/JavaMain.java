public class JavaMain {
    public static void main(String[] args) {
        Pessoa pes1 = new Pessoa("Lucas", 28, Sentimento.BEM);
        Pessoa pes2 = new Pessoa("Fulano", 25, Sentimento.CANSADO);

        pes1.dizerOla(pes2);
        pes2.apresentar_se(pes1);
        pes1.dizerSentrimento(pes2);
    }
}
